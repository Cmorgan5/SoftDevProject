/**
 * Class: Entity(Character
 * @author:Cory Morgan
 * @version 1.0 
 * Course: ITEC
 * Purpose - To create Character and have inventory with items 
 * and for taking and giving damage
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class Character {
	
	//Character with different attributes: health, inventory, money, etc
	protected String name;
	private int healthPoints;
	private Item currentweapon;
	//private Armor currentarmor;
	private ArrayList<Item> inventory;
	private String location;
	private int money;
	private Random r = new Random();
	//Starts off each level with 100 health, and can regenerate health 
	//with various items
	private final int MAX_HEALTH = 100;
	

	/** Method Entity
	 * Constructor
	 * 
	 * @param name - String representing the entity name
	 */
	public Character() {
//this.name = name;
//		inventory = new ArrayList<Item>();
//		healthPoints = MAX_HEALTH;
	}

	/** Method getName
	 * gets the name of the entity
	 * 
	 * @param none
	 * @return String - the name of the entity
	 */
	public String getName() {
		return name;
	}

	/** Method getHealthPoints
	 * gets the health points of the entity
	 * 
	 * @param none
	 * @return int - the health points of the entity
	 */
	public int getHealth(int healthpoints) {
		return healthpoints;
	}

	/** Method addItem
	 * adds an item to an entity
	 * 
	 * @param Item - the item to be added
	 * @return void
	 */
	public void addItem(Item item) {
		inventory.add(item);
	}

	/** Method removeItem
	 * removes an item from an entity
	 * 
	 * @param Item - the item to be removed
	 * @return void
	 */
	public void removeItem(Item item) {
		inventory.remove(item);
	}

	/** Method isItemAvailable
	 * determines if an item is in the entity inventory
	 * 
	 * @param Item - the item to be checked
	 * @return boolean - true if there, false if not
	 */
	public boolean isItemAvailable(Item item) {
		if (inventory.contains(item)) {
			
			System.out.println("Item is avaiable for use.");
			return true;
		} else {
			
			System.out.println("Not avaiable");
			return false;
		}
	}

	/** Method takeDamage
	 * tracks damage an entity takes
	 * 
	 * @param int - amount of damage taken
	 * @return void
	 */
	public void takeDamage(int hit) {
		
		
		healthPoints -= hit;
	}
	
	
	public void attack(Character c) {
		
		c.healthPoints = 0;
		
		
	}

	/** Method takeHealing
	 * tracks healing for an entity
	 * 
	 * @param int - amount of healing received
	 * @return void
	 */
	public void takeHealing(int heal) {
		healthPoints += heal;
	}
	
	/**Method pickUpItem
	 * picks up item found
	 * in rooms or from killing
	 * monsters/solving puzzles
	 * 
	 * @param item
	 * @return void
	 */
	public void pickUpItem(Item item) {
		
		inventory.add(item);	
	}
	
	/**Method dropItem
	 * Drops item from inventory
	 * that are not wanted
	 * 
	 * @param item
	 * @return void
	 */
	public void dropItem(Item item) {
		
		inventory.remove(item);
	}
	
	public String getLocation(String location)
	{
		
		return location;
		
		
	}

	@Override
	/** Method toString
	 * formats a String with the entity name and items associated with entity
	 * 
	 * @param none
	 * @return void
	 */
	public String toString() {
		
		return name + " with " + healthPoints + " of health has the following items: \n" + inventory.toString();
	}
	
}



