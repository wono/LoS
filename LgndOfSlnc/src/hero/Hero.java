package hero;

import java.util.ArrayList;
import java.util.Random;

import objects.Pocketable;
import objects.equipment.Armour;
import objects.equipment.Equipable;
import main.Engine;
import monsters.Monster;



public class Hero {
	
	public String			name;
	
	public int				maxHP, currentHP;
	public int				strength, agility, cunning;
	
	public ArrayList<Skill>	skills		= new ArrayList<Skill>();
	
	Random					numGen		= new Random();
	
	public Equipable		hands[];
	public Armour			wearing;
	
	public Inventory		inventory	= new Inventory();
	
	
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
