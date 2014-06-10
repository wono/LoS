import java.util.Random;

import Monsters.Monster;
import Monsters.TestMonster;

/**
 * Room interaction flow:
 * 	Enter room
 * 	if first time entering room, describe event
 * 	describe room
 * 	if monster in room, describe monster and fight
 * 	take player input
 * 
 * @author T-Dawg
 *
 */
public class Room {
	
	String			name;
	boolean			firstTime	= true;
	String			eventFirstTime;
	private String	description;
	
	public Room		east, west, north, south, up, down;
	
	Monster			monster;
	
	Random			numGen		= new Random();
	
	
	public Room(String name, String desc, float monsterChance) {
	
		this.name = name;
		this.description = desc;
		
		// Random monster
		if (numGen.nextFloat() < monsterChance)
			monster = new TestMonster();
	}
	
	
	/** Description of room. If any special events on first time entering,
	 * they should display here. */
	public String describe() {
	
		String roomDesc = "";
		
		if (firstTime && eventFirstTime != null) {
			firstTime = false;
			roomDesc = roomDesc.concat(eventFirstTime);
		}
		
		roomDesc = roomDesc.concat("\n" + description);
		
		
		return roomDesc;
	}
	
	
	public String checkForMonster() {
		
		
		if (monster != null)
			return "There is a monster here!";
		
		return null;
	}
	
	
	public String passable(Room direction) {
		
		
//		if (monster != null)
//			return "The monster blocks your path!";
		
		return "clear";
	}
	
	public String toString() {
	
		return name;
	}


	
	
}
