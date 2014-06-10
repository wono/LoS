package objects.equipment;

/** An abstract weapon class. */
public abstract class Weapon extends Equipable {

	public int damage;
	
	
	public Weapon(String n, String desc, char shrtct, int dmg) {
	
		super(n, desc, shrtct);
		
		damage = dmg;
	}
	
}
