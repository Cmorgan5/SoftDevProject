import java.util.ArrayList;
import java.util.Scanner;


public class GameTest {
	
	Character name;
	
	
	
	static Item potion = new Item("potion", 3);
	static Item weapon = new Item("weapon", 20);
	static Item armor = new Item("armor", 13);
	
	
	private int MAX_HEALTH = 100;
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		
		Item potion = new Item("potion", 3);
		Item weapon = new Item("weapon", 20);
		
		Player p = new Player("Cory");
		Player enemy = new Player("Enemy");
		p.getGreeting();
		System.out.println("Player current health:" + p.getHealth());
		System.out.println("Enemy current health: " + enemy.getHealth());
		System.out.println("Would you like to attack the enemy?");
		//System.out.println("With what weapon?");
		if( input.nextLine().equalsIgnoreCase("yes"))
				{
			
			p.attack(enemy, 20);
			
				}
		
		else
			
			System.out.println("Wrong answer!");
		
		System.out.println("Player current health:" + p.getHealth());
		System.out.println("Enemy current health: " + enemy.getHealth());
		enemy.toString();
		//enemy.takeDamage(20);
		
		
		
		ArrayList<Item> inventory = new ArrayList<Item>();
		
		inventory.add(potion);
		inventory.add(weapon);
		System.out.println(inventory);
		//p.isItemAvailable(weapon);
	    
//	player.getHealth();
//	player.toString();
//	enemy.getHealth();
//	enemy.toString();
//	player.attack(enemy);
//	enemy.toString();
//	//enemy.takeDamage();
//	//enemy.g
	 
	 

	}

}
