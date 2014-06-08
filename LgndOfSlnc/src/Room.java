public class Room {
	
	String			name;
	
	boolean			firstTime	= true;
	
	String			eventFirstTime;
	
	private String	description;
	
	public Room		east, west, north, south, up, down;
	
	
	
	public Room(String name, String desc) {
	
		this.name = name;
		this.description = desc;
		
		// Random monster?
	}
	
	
	/** Description of room. If any special events on first time entering,
	 * they should display here. */
	public String describe() {
	
		if (firstTime && eventFirstTime != null) {
			firstTime = false;
			return eventFirstTime + "\n" + description;
		} else
			return description;
	}
	
	public String toString() {
	
		return name;
	}
	
}
