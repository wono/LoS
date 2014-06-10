package Objects;

/** Objects that can be picked up and "pocketed". */
public abstract class Pocketable extends Interactable {

	/** Inventory item key this item is assigned to. */
	public char shortcutKey;
//	public ItemType type;
	
	public Pocketable(String n, String desc, char shrtct) {
	
		super(n, desc);
		
		shortcutKey = shrtct;
//		type = typ;
	}
	
	/** What happens when an item is picked up. */
	public abstract String get();
	
	public abstract String drop();
	
	/** What happens when an item is selected from inventory. */
	public abstract String use();
	
	/** When item is used on another object. */
	public abstract String use(Interactable useon);
	
	
}