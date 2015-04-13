import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class LevelTest {

	Level l;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		Room r1 = new Room("Room 1.", new Enemy("Enemy 1.", 3, "Gun"), new Puzzle("Puzzle 1.", "Solution 1"),
				new Item("Item 1", 100));
		Room r2 = new Room("Room 2.", new Enemy("Enemy 2.", 5, "Melee"), new Puzzle("Puzzle 2.", "Solution 2"),
				new Item("Item 2", 100));
		Room r3 = new Room("Room 3.", new Enemy("Enemy 3.", 7, "Boss"), new Puzzle("Puzzle 3.", "Solution 3"),
				new Item("Item 3", 100));
		ArrayList<Room> roomList = new ArrayList<Room>();
		roomList.add(r1);
		roomList.add(r2);
		roomList.add(r3);
		Item i1 = new Item("Item 4", 100);
		Item i2 = new Item("Item 5", 200);
		Item i3 = new Item("Item 6", 300);
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		l = new Level(roomList, new Store(itemList, 5000));
	}

	/**
	 * Tester method for Level and its getters.
	 */
	@Test
	public void testLevel() 
	{
		Room r1 = new Room("Room 1.", new Enemy("Enemy 1.", 3, "Gun"), new Puzzle("Puzzle 1.", "Solution 1"),
				new Item("Item 1", 100));
		Room r2 = new Room("Room 2.", new Enemy("Enemy 2.", 5, "Melee"), new Puzzle("Puzzle 2.", "Solution 2"),
				new Item("Item 2", 100));
		Room r3 = new Room("Room 3.", new Enemy("Enemy 3.", 7, "Boss"), new Puzzle("Puzzle 3.", "Solution 3"),
				new Item("Item 3", 100));
		ArrayList<Room> roomList = new ArrayList<Room>();
		roomList.add(r1);
		roomList.add(r2);
		roomList.add(r3);
		Item i1 = new Item("Item 4", 100);
		Item i2 = new Item("Item 5", 200);
		Item i3 = new Item("Item 6", 300);
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		for (int i = 0; i < roomList.size(); i++)
		{
			assertEquals(roomList.get(i).getDescription(), l.getRooms().get(i).getDescription());
			assertEquals(roomList.get(i).getEnemy().getName(), l.getRooms().get(i).getEnemy().getName());
			assertEquals(roomList.get(i).getEnemy().getDifficulty(), l.getRooms().get(i).getEnemy().getDifficulty());
			assertEquals(roomList.get(i).getEnemy().getType(), l.getRooms().get(i).getEnemy().getType());
			assertEquals(roomList.get(i).getPuzzle().getDescription(), l.getRooms().get(i).getPuzzle().getDescription());
			assertEquals(roomList.get(i).getPuzzle().getSolution(), l.getRooms().get(i).getPuzzle().getSolution());
			assertEquals(roomList.get(i).getItem().getName(), l.getRooms().get(i).getItem().getName());
			assertEquals(itemList.get(i).getName(), l.getStore().getStock().get(i).getName());
		}
	}
}
