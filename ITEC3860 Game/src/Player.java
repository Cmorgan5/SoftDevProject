/**Class: Player
 * @author Cory Morgan
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

public class Player extends Entity {

	private int money;
	
	public Player(String name, int money) {
		super(name);
	}

	public int getMoney() {
		return money;
	}
	
	@Override
	public void addItem(Item item) {
		super.addItem(item);
	}

	@Override
	public void removeItem(Item item) {
		super.removeItem(item);
	}

	@Override
	public void takeDamage(int hit) {
		super.takeDamage(hit);
	}


	@Override
	public String getGreeting() 
	{
		System.out.println("Hello World");
		return null;
	}


}