package objects;


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
	
	/** Any special action that happens when an item is picked up. */
	public abstract void get();
	
	/** Any special action that happens when item is dropped. */
	public abstract void drop();
	
	/** What happens when an item is selected from inventory. */
	public abstract void use();
	
	/** When item is used on another object. */
	public abstract void use(Interactable useon);
	
	
}