import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PuzzleTest {

	Puzzle p;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		p = new Puzzle("Puzzle 1", "Solution 1");
	}
	
	/**
	 * Tester method for Puzzle and its getters.
	 */
	@Test
	public void testPuzzle()
	{
		String expectedDescription = "Puzzle 1";
		assertEquals(expectedDescription, p.getDescription());
		String expectedSolution = "Solution 1";
		assertEquals(expectedSolution, p.getSolution());
		boolean expectedSolvedState = false;
		assertEquals(expectedSolvedState, p.isSolved());
	}
	
	/**
	 * Tester method for solve()
	 */
	@Test
	public void testSolve()
	{
		boolean expectedSolvedState = false;
		assertEquals(expectedSolvedState, p.isSolved());
		p.solve();
		assertEquals(true, p.isSolved());
	}
}
