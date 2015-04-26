import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EnemyTest {

	Enemy e;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp()
	{
		e = new Enemy("Enemy 1");
	}

	/**
	 * Tester method for Enemy and its getters.
	 */
	/*@Test
	public void testEnemy()
	{
		assertEquals("Enemy 1", e.getName());
		assertEquals(3, e.getDifficulty());
		assertEquals("Gun", e.getType());
	}*/
	
	/**
	 * Tester method for setDifficulty()
	 */
	/*@Test
	public void testSetDifficulty()
	{
		assertEquals(3, e.getDifficulty());
		e.setDifficulty(5);
		assertEquals(5, e.getDifficulty());
	}*/
	
	/**
	 * Tester method for getGreeting()
	 */
	@Test
	public void testGetGreeting()
	{
		assertEquals("Enemy 1 stands in the room.", e.getGreeting());
	}
}
