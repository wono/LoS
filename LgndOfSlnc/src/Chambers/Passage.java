package Chambers;


/**
 * A passage between rooms. Can be a hallway, a crawlway,
 * a path or simply an obstruction such as a door or a grate.
 * Generally non-descript and connects two rooms.
 * @author T-Dawg
 */
public abstract class Passage {
	
	/** The type of passage (hallway, doorway, etc..) */
	public String	type;
	/** An obstruction blocks passage between rooms. */
	public boolean blocking;
	public String description;
	boolean encountersPossible;
	private Room	connectingRooms[];
	
	
	
	
	public Passage(Room connectingRoom1, Room connectingRoom2) {
		
		connectingRooms[0] = connectingRoom1;
		connectingRooms[1] = connectingRoom2;
	}
	
	
	public Room enterFrom(Room roomExited) {
		
		if (blocking)
			return null;
		
		if (roomExited == connectingRooms[0])
			return connectingRooms[1];
		else
			return connectingRooms[0];
	}
	
	
	/**
	 * Peer into a room get an idea as to what is in there.
	 * @param direction
	 * @return
	 */
//	public String look(Room direction) {
//	
//		
//		if (direction == null)
//			return "nothing.";
//		else {
//			String msg = "You look 
//			if (direction.explored)
//				return direction.toString();
//			else
//		return 
//		
//	}
}
