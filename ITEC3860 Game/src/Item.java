import java.util.Random;

/**
 * Class: Item
 * @author: Cory Morgan
 * @version 1.0 
 * Course: ITEC 
 * 
 * Item class to create all of the items the games involves including
 * weapons and potions
 */


public class Item {
	
	
	
	
	private String name;
	int value;
	boolean weapon;
	private Random r = new Random();

	/** Method Item
	 * Constructor
	 * 
	 * @param name - String representing the item name
	 */
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/** Method getName
	 * gets the name of the item
	 * 
	 * @param none
	 * @return String - the name of the item
	 */
	public String getName() {
		return name;
	}

	/** Method setWeapon
	 * sets the item to a weapon
	 * 
	 * @param none
	 * @return void
	 */
	public void setWeapon() {
		 weapon = true;
	}

	/** Method isWeapon
	 * determines if an item is a weapon
	 * 
	 * @param none
	 * @return boolean - true if it is a weapon, false if not
	 */
	
	public int getValue() {
		
		//random value just to keep the game changing
		return value;
	}
	
	public String toString()
	{
		 return "Item name is: " + name;
				
	}

	@Override
	/** Method equals
	 * determines if an item is the same as the implicit item
	 * 
	 * @param Object - item to be compared
	 * @return boolean - true if they have the same name, false if different
	 */
	public boolean equals(Object obj) {
		if (name.equals(((Item) obj).getName())) {
			return true;
		} else {
			return false;
		}
	}
}