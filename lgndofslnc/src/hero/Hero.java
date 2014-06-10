package Hero;

import java.util.ArrayList;
import java.util.Random;

import main.Engine;
import Monsters.*;
import Objects.Pocketable;
import Objects.Equipment.Armour;
import Objects.Equipment.Equipable;


public class Hero {
	
	public String			name;
	
	public int				maxHP, currentHP;
	public int				strength, agility, cunning;
	
	public ArrayList<Skill>	skills	= new ArrayList<Skill>();
	
	Random					numGen	= new Random();
	
	public Equipable		hands[];
	public Armour			wearing;
	
	public ArrayList<Pocketable>		inventory = new ArrayList<Pocketable>();
	
	
	public Hero(String name) {
	
		this.name = name;
		generateStats();
	}
	
	/** Creates the new hero's stats. */
	private void generateStats() {
	
		strength = (int) (numGen.nextFloat() * 5) + 5;
		agility = (int) (numGen.nextFloat() * 5) + 5;
		cunning = (int) (numGen.nextFloat() * 5) + 5;
	}
	
	/** Pick up an item and put in inventory. */
	public void get(Pocketable item) {
	
		//check max load
		
		// add item to inventory
		inventory.add(item);
	}
	
	/** Drop an item from inventory. */
	public void drop(Pocketable item) {
		
		inventory.remove(item);
	}
	
	/** Display inventory. */
	public void inventory() {
		
		String invent = "";
		for (Pocketable item : inventory)
			invent = invent.concat(item.name + "\n");
		
		Engine.out(invent);
	}
	
	/** */
	public void attack(Monster target) {
	
		// Some attack formula to hit
		// target.takeDamage(Some damage formula)
	}

	/** Find the hero's highest attribute and return an adjective describing it. */
	public String mainAttribute() {
	
		int highest = 0;
		String att = null;
		if (strength > highest) {
			highest = strength;
			att = "strong";
		}
		if (agility > highest) {
			highest = agility;
			att = "agile";
		}
		if (cunning > highest) {
			highest = cunning;
			att = "cunning";
		}
		return att;
	}
}
