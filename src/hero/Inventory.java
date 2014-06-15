package hero;

import java.util.ArrayList;

import main.Engine;
import objects.Pocketable;


public class Inventory extends ArrayList<Pocketable> {
	
	
	int maxCapacity = 10;
	
	
	
	/** Pick up an item and put in inventory. */
	public void get(Pocketable item) {
	
		//check max load
		if (this.size() >= this.maxCapacity)
			Engine.outln("Your inventory is full!");
		
		else { // add item to inventory
			this.add(item);
			Engine.outln("You pick up the " + item + " and put it"
							+ "in your pack");
			item.get();
		}
	}
	
	/** Drop an item from inventory. */
	public void drop(Pocketable item) {
	
		this.remove(item);
		item.drop();
	}
	
	/** Display inventory. */
	public void displayInventory() {
	
		String invent = "";
		for (Pocketable item : this)
			invent = invent.concat(item.name + "\n");
		
		Engine.out(invent);
	}
	
}
