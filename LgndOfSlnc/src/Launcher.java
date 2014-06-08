import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
	
	public static final String		version	= ".01";
	public static Scanner			scan	= new Scanner(System.in);
	
	public static ArrayList<Room>	dungeon	= new ArrayList<Room>();
	
	
	public static Room				currentRoom;
	private static boolean			combat	= false;
	
	
	public static void main(String[] args) {
	
		outln("Welcome to Legend of Silence v" + version);
		
		// setup hero
		// new Hero()
		out("What is thy name, Hero? ");
		
		String name = scan.nextLine();
		outln("Thy name be " + name + ". How thou art strong!");
		
		// setup dungeon
		testDungeon();
		
		while (true) {
			outln("You are in " + currentRoom + ".\n" + currentRoom.describe());
			
			
			if (!combat) {
				
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
					default:
						outln("I'm afraid I do not understand that command");
						
				}
			} else {
				// fight!
			}
			
		}
	}
	
	private static void go(Room direction) {
	
		if (direction == null)
			outln("You cannot go that way.");
		else
			currentRoom = direction;
		
	}
	
	/** Convenience method for printing to terminal with a new line. */
	private static void outln(String output) {
	
		System.out.println(output + "\n");
		
	}
	
	/** Convenience method for printing to terminal. */
	public static void out(String output) {
	
		System.out.print(output);
		
	}
	
	
	public static void testDungeon() {
	
		Room r1 = new Room("Start", "You are in a large courtyard enclosed by grey stone walls engulfed in rose bushes."
									+ " A forboding castle looms in front of you."
									+ " A lonely door blocks your path north.", 0);
		r1.eventFirstTime = "The gate clatters shut behind.";
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
		
		
		currentRoom = r1;
	}
}
