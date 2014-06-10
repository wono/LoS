package main;

import java.util.ArrayList;
import java.util.Scanner;

import Chambers.Room;

/**
 * The main entrance to the Game.
 * @author T-Dawg
 * 
 * This will get merged?
 *
 */
public class Engine {
	
	public static Scanner			scan;
	
	public static ArrayList<Room>	dungeon;
	
	public static Room				currentRoom;
	private static boolean			combat	= false;
	
	
	public Engine(Scanner scn, ArrayList<Room> dngn) {
	
		scan = scn;
		dungeon = dngn;
		currentRoom = dungeon.get(0);
	}
	
	
	public void run() {
	
		/** Phases of a normal turn:
		 * 		1) Describe the area, including monsters
		 * 		2) Allow player to choose action
		 * 		3) Perform action
		 * Phases of a combat turn:
		 * 		1) Describe monster/situation
		 * 		2) Allow player to choose action
		 * 		3) Allow monster to take action
		 */
		while (true) {
			
			if (!combat) {
				
				outln("You are in " + currentRoom + ".");
				outln(currentRoom.describe());
				String checkMonster = currentRoom.checkForMonster();
				
				if (checkMonster != null) {
					combat = true;
					outln(checkMonster);
				}
				
				
				outln("What is thy command?");
				char command = scan.nextLine().charAt(0);
				switch (command) {
					case 'n':
						go(currentRoom.north);
						break;
					case 's':
						go(currentRoom.south);
						break;
					case 'e':
						go(currentRoom.east);
						break;
					case 'w':
						go(currentRoom.west);
						break;
					case 'x': //exit game
						return;
					default:
						outln("I'm afraid I do not understand that command");
				}
			} else {
				// fight!
				out("Thou art in combat!");
				out("What is thy command?");
				char command = scan.nextLine().charAt(0);
				
				switch (command) {
					case 'a': //attack
						break;
					case 'r': //run
						break;
					
					default:
						outln("There is little time for that!");
				}
				
				// monster.attack()
			}
		}
	}
	
	
	private static void go(Room direction) {
	
		if (direction == null)
			outln("You cannot go that way.");
		else {
			String attempt = currentRoom.passable(direction);
			if (attempt.equals("clear"))
				currentRoom = direction;
			else
				outln(attempt);
		}
		
	}
	
	/** Convenience method for printing to terminal with a new line. */
	private static void outln(String output) {
	
		System.out.println(output);
		
	}
	
	/** Convenience method for printing to terminal. */
	public static void out(String output) {
	
		System.out.print("\n" + output);
		
	}
}
