
import java.util.ArrayList;
import java.util.Scanner;

import main.Engine;
import Chambers.Room;
import Hero.Hero;

/**
 * The main entrance to the prgoram. Setup for playing.
 * @author T-Dawg
 *
 */
public class Launcher {
	
	public static final String		version	= ".02";
	public static Scanner			scan	= new Scanner(System.in);
	
	public static ArrayList<Room>	dungeon	= new ArrayList<Room>();
	
	
	public static void main(String[] args) {
	
		out("Welcome to Legend of Silence v" + version);
		
		// setup hero
		Hero hero;
		out("What is thy name, Hero? ");
		
		hero = new Hero(scan.nextLine());
		outln("Thy name be " + hero.name + ". How thou art " + hero.mainAttribute() + "!\n");
		
		// setup dungeon
		testDungeon();
		
		new Engine(scan, dungeon).run();
		
		out("Thank you for playing The Legend of Silence");
		
	}
	
	
	/** Convenience method for printing to terminal with a new line. */
	private static void outln(String output) {
	
		System.out.println(output);
		
	}
	
	/** Convenience method for printing to terminal. */
	public static void out(String output) {
	
		System.out.print("\n" + output);
		
	}
	
	
	public static void testDungeon() {
	
		Room r1 = new Room("Start", "You are in a large courtyard enclosed by grey stone walls engulfed in rose bushes."
									+ "\nA forboding castle looms in front of you."
									+ " A lonely door blocks your path north.", 0);
		r1.eventFirstTime = "The gate clatters shut behind you.";
		Room r2 = new Room("r2", "Can go south, north and east.", .9f);
		Room r3 = new Room("r3", "Can go west and north.", .5f);
		Room r4 = new Room("r4", "Can go south and west.", .25f);
		Room r5 = new Room("r5", "Can go south and east.", .5f);
		
		r1.north = r2;
		
		r2.south = r1;
		r2.east = r3;
		r2.north = r5;
		
		r3.west = r2;
		r3.north = r4;
		
		r4.south = r3;
		r4.west = r5;
		
		r5.south = r2;
		r5.east = r4;
		
		dungeon.add(r1);
		dungeon.add(r2);
		dungeon.add(r3);
		dungeon.add(r4);
		dungeon.add(r5);
		
		
	}
}
