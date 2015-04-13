import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RoomTest {

	Room r;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		r = new Room("Room 1.", new Enemy("Enemy 1.", 3, "Gun"), new Puzzle("Puzzle 1.", "Solution"),
				new Item("Item 1", 100));
	}

	/**
	 * Tester method for Room and its getters.
	 */
	@Test
	public void testRoom()
	{
		assertEquals("Room 1. Puzzle 1. There is a Item 1 on the floor.", r.getDescription());
		Enemy e = new Enemy("Enemy 1.", 3, "Gun");
		assertEquals(e.getName(), r.getEnemy().getName());
		assertEquals(e.getDifficulty(), r.getEnemy().getDifficulty());
		assertEquals(e.getType(), r.getEnemy().getType());
		Puzzle p = new Puzzle("Puzzle 1.", "Solution");
		assertEquals(p.getDescription(), r.getPuzzle().getDescription());
		assertEquals(p.getSolution(), r.getPuzzle().getSolution());
		Item i = new Item("Item 1", 100);
		assertEquals(i.getName(), r.getItem().getName());
	}
	
	/**
	 * Tester method for hasEnemy()
	 */
	@Test
	public void testHasEnemy()
	{
		assertEquals(true, r.hasEnemy());
		Room r2 = new Room("Room 1.", null, new Puzzle("Puzzle 1.", "Solution"),
				new Item("Item 1", 100));
		assertEquals(false, r2.hasEnemy());
	}
	
	/**
	 * Tester method for hasPuzzle()
	 */
	@Test
	public void testHasPuzzle()
	{
		assertEquals(true, r.hasPuzzle());
		Room r2 = new Room("Room 1.", new Enemy("Enemy 1.", 3, "Gun"), null,
				new Item("Item 1", 100));
		assertEquals(false, r2.hasPuzzle());
	}
	
	/**
	 * Tester method for hasItem()
	 */
	@Test
	public void testHasItem()
	{
		assertEquals(true, r.hasItem());
		Room r2 = new Room("Room 1.", new Enemy("Enemy 1.", 3, "Gun"), new Puzzle("Puzzle 1.", "Solution"),
				null);
		assertEquals(false, r2.hasItem());
	}
	
	/**
	 * Tester method for isPassable() and setPassable()
	 */
	@Test
	public void testIsPassableAndSetPassable()
	{
		assertEquals(false, r.isPassable());
		r.getPuzzle().solve();
		r.getEnemy().takeDamage(r.getEnemy().getHealth());
		assertEquals(0, r.getEnemy().getHealth());
		r.setPassable();
		assertEquals(true, r.isPassable());
		
	}
}
