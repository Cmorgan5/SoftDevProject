import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StoreTest {

	Store s;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		ArrayList<Item> listOfItems = new ArrayList<Item>();
		listOfItems.add(new Item("Item 1", 100));
		listOfItems.add(new Item("Item 2", 10));
		listOfItems.add(new Item("Item 3", 1000));
		s = new Store("Store 1", listOfItems, 5000);
	}
	
	/**
	 * Tester method for Store and its getters.
	 */
	@Test
	public void testStore()
	{
		ArrayList<Item> listOfItems = new ArrayList<Item>();
		listOfItems.add(new Item("Item 1", 100));
		listOfItems.add(new Item("Item 2", 10));
		listOfItems.add(new Item("Item 3", 1000));
		assertEquals(listOfItems, s.getStock());
		assertEquals(5000, s.getBudget());
	}
	
	/**
	 * Tester method for sellItem() method.
	 */
	@Test
	public void testSellItem()
	{
		ArrayList<Item> listOfItems = new ArrayList<Item>();
		listOfItems.add(new Item("Item 1", 100));
		listOfItems.add(new Item("Item 2", 10));
		listOfItems.add(new Item("Item 3", 1000));
		assertEquals(listOfItems, s.getStock());
		int expectedBudget = 5000;
		assertEquals(expectedBudget, s.getBudget());
		Player p = new Player("Player 1");
		s.sellItem(p, listOfItems.get(0));
		expectedBudget = (expectedBudget + 100);
		listOfItems.remove(0);
		assertEquals(listOfItems, s.getStock());
	}
}
