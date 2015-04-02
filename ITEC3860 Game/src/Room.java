
public class Room {

	private String description;
	private Puzzle puzzle;
	private Enemy enemy;
	private boolean passable;
	private Item item;
	
	public Room(String desc, Enemy en, Puzzle puzz, Item i)
	{
		this.description = desc;
		this.puzzle = puzz;
		this.enemy = en;
		this.item = i;
		if (puzzle != null)
		{
			passable = false;
		}
		else
		{
			passable = true;
		}
	}
	
	public String getDescription()
	{
		return description + puzzle.getDescription() + "There is a " + item + " on the floor.";
	}
	
	public Enemy getEnemy()
	{
		return enemy;
	}
	
	public Puzzle getPuzzle()
	{
		return puzzle;
	}
	
	public boolean hasPuzzle()
	{
		if (puzzle != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Item getItem()
	{
		return item;
	}
	
	public boolean isPassable()
	{
		return passable;
	}
	
	public void setPassable()
	{
		if (puzzle.isSolved() == true)
		{
			passable = true;
		}
		else
		{
			passable = false;
		}
	}
}
