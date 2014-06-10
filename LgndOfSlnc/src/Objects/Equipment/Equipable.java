package objects.equipment;

import objects.Pocketable;

/** Items that can be worn. */
public abstract class Equipable extends Pocketable {

	public boolean enchanted;
	public boolean cursed;
	
	public Equipable(String n, String desc, char shrtct) {
	
		super(n, desc, shrtct);
		
	}
	
}
