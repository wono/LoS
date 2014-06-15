package objects.equipment;


public abstract class Armour extends Equipable {

	public int			defense;

	
	public Armour(String name, String desc, char shrtct, int def) {
	
		super(name, desc, shrtct);

		defense = def;
	}
	
}
