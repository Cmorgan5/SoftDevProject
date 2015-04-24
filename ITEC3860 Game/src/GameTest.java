import java.util.ArrayList;


public class GameTest {
	
	Character name;
	
	static Character player;
	static Character enemy;
	ArrayList<Item> inventory = new ArrayList<Item>();
	
	static Item potion = new Item("potion", 3);
	static Item weapon = new Item("weapon", 20);
	static Item armor = new Item("armor", 13);
	
	
	private final int MAX_HEALTH = 100;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item potion = new Item("potion", 3);
		Item weapon = new Item("weapon", 20);
		
		Player p = new Player("Cory");
		Player enemy = new Player("Enemy");
		p.getGreeting();
		p.getHealth(100);
		enemy.getHealth(100);
		p.toString();
		p.attack(enemy);
		enemy.toString();
		enemy.takeDamage(20);
		
		
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
