package objects.equipment;

import main.Engine;
import objects.Interactable;


public class Knife extends Weapon {

	public Knife(String n, String desc) {
	
		super(n, desc, 'k', 2);
	}

	@Override public void get() {
	}

	@Override public void drop() {
	
		Engine.outln("The " + name + " hits the ground with a clink.");
	}

	@Override public void use() {

	}

	@Override public void use(Interactable useon) {
	
	}
	
}
