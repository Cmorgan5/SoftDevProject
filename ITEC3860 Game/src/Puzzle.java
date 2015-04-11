/**Class: Puzzle
 * @author Jacob Fagan
 * @version 1.0
 * Course : ITEC 3150
 * Written: April 3, 2015
 *
 *
 * This class – A puzzle with a description and a solution. The puzzle will remain unsolved and impede
 * progress from the room is lies within until the solution is inputted by the player.
 *
 * Purpose: – Create and define a puzzle.
 */ 

public class Puzzle {

	private String description;
	private String solution;
	private boolean solved;
	
	/**
	 * creates a puzzle with a description that describes the puzzle, and a solution that will
	 * solve the puzzle when inputted by the player. Also sets the puzzle to an unsolved state
	 * on creation.
	 * @param aDescription
	 * @param aSolution
	 */
	public Puzzle(String aDescription, String aSolution)
	{
		this.description = aDescription;
		this.solution = aSolution;
		solved = false;
	}
	
	/**
	 * getter method for description
	 * @return description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * getter method for the solution
	 * @return solution
	 */
	public String getSolution()
	{
		return solution;
	}
	
	/**
	 * checks whether or not the puzzle has been solved. If false is returned, the 
	 * puzzle has not been solved. If true is returned, the puzzle has been solved
	 * @return
	 */
	public boolean isSolved()
	{
		return solved;
	}
	
	/**
	 * sets the puzzle to a solved state.
	 */
	public void solve()
	{
		solved = true;
	}
}
