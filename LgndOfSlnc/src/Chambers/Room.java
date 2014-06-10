package Chambers;

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
	
	public String	name;
	public String	eventFirstTime;
	private String	description;
	
	boolean			explored	= false;
	boolean			firstTime	= true;
	
	
	public Room		east, west, north, south, up, down;
//	public Passage	east, west, north, south, up, down;
	
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
			explored = true;
			roomDesc = roomDesc.concat(eventFirstTime);
		}
		
		roomDesc = roomDesc.concat("\n" + description);
		roomDesc = roomDesc.concat("\n" + exits());
		
		return roomDesc;
	}
	
	/**
	 * Prints exits from this room.
	 * @return
	 */
	public String exits() {
	
		boolean first = true;
		String msg = "There is an exit ";
		
		if (north != null) {
			
			msg = msg.concat("north");
			first = false;
		}
		
		if (east != null) {
			if (!first)
				msg = msg.concat(", ");
			msg = msg.concat("east");
			first = false;
		}
		
		if (south != null) {
			if (!first)
				msg = msg.concat(", ");
			msg = msg.concat("south");
			first = false;
		}
		
		if (west != null) {
			if (!first)
				msg = msg.concat(", and ");
			msg = msg.concat("west");
			first = false;
		}
		
		if (first)
			return "There are no exits";
		else
			return msg.concat(".");
	}
	
	
	public String checkForMonster() {
	
		
		if (monster != null)
			return "There is a monster here!";
		
		return null;
	}
	
	
	/**
	 * Peer into a room get an idea as to what is in there.
	 * @param direction
	 * @return
	 */
	public String look(Passage direction) {
	
		
		if (direction == null)
			return "nothing.";
		else if (direction.blocking) {
			return "You see a " + direction.type;
		} else {
			String msg = "You peer through the " + direction.type +
							" and see ";
			if (direction.enterFrom(this).explored)
				return msg.concat(direction.toString());
			else
				return msg.concat("a room you haven't been too");
		}
		
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
