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
	
		Engine.outln("The " + name + " hits the ground with a high-pitched clang.");
	}

	@Override public void use() {
		
		Engine.outln("Planning to off yourself already? There is so much to live for!");

	}

	@Override public void use(Interactable useon) {
	
	}
	
}
