package Objects;

/** All objects in game that can be interacted with in some fashion.
 * Room objects, pickupable items, equipable items. */
public abstract class Interactable {
	
	public String name;
	private String description;
	
	public Interactable(String n, String desc) {
		
		name = n;
		description = desc;
	}
	
	public abstract String describe();
}
