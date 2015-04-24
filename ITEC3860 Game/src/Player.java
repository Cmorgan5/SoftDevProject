/**Class: Player
 * @author Cory Morgan, Jacob Fagan
 * @version 1.0
 * Course : ITEC 3150
 * Written: April 3, 2015
 *
 *
 * This class – Thread for getting money
 *
 * Purpose: – Creates a thread that get random money
 * Portions of this code were taken from the sample code for the in-class multithreading assignment
 */ 

public class Player extends Character {

	private int money;
	
	/**
	 * creates a player with a name and sets their money to $500
	 * @param name
	 * @param money
	 */
	public Player(String name) {
		super();
		this.money = 500;
	}

	/**
	 * getter method for money
	 * @return money
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * adds an item to the players inventory
	 */
	@Override
	public void addItem(Item item) {
		super.addItem(item);
	}

	/**
	 * removes an item from the player's inventory
	 */
	@Override
	public void removeItem(Item item) {
		super.removeItem(item);
	}

	/**
	 * applies damage to the player
	 */
	@Override
	public void takeDamage(int hit) {
		super.takeDamage(hit);
	}

	/**
	 * returns a gretting from the player.
	 */
	public String getGreeting() 
	{
		System.out.println("Hello World");
		return null;
	}


}