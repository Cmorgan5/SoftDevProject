
public class Room {

	private String description;
	private Puzzle puzzle;
	private Enemy enemy;
	private boolean passable;
	private Item item;
	
	/**
	 * creates a room with a description, enemy, puzzle, and item. Enemy, puzzle, and item
	 * may be null, meaning that there is no enemy/puzzle/item in the room
	 * @param aDescription
	 * @param anEnemy
	 * @param aPuzzle
	 * @param anItem
	 */
	public Room(String aDescription, Enemy anEnemy, Puzzle aPuzzle, Item anItem)
	{
		this.description = aDescription + " " + aPuzzle.getDescription() + " There is a " + anItem.getName() + " on the floor.";
		this.puzzle = aPuzzle;
		this.enemy = anEnemy;
		this.item = anItem;
		if (puzzle != null)
		{
			passable = false;
		}
		else
		{
			passable = true;
		}
	}
	
	/**
	 * getter method for the description of the room. The description also includes the
	 * enemy, puzzle, and item descriptions, if applicable.
	 * @return description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * getter method for the enemy in the room. If enemy is null, there is no enemy in the room.
	 * @return enemy
	 */
	public Enemy getEnemy()
	{
		return enemy;
	}
	
	/**
	 * checks whether or not the room has an enemy in it. If false is returned, there is no
	 * enemy in the room
	 * @return true if enemy is not null, false is enemy is null
	 */
	public boolean hasEnemy()
	{
		if (enemy != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * getter method for the puzzle in the room. If item is null, there is no puzzle in the room.
	 * @return puzzle
	 */
	public Puzzle getPuzzle()
	{
		return puzzle;
	}
	
	/**
	 * checks whether or not the room has a puzzle in it. If false is returned, there is no
	 * puzzle in the room
	 * @return true if puzzle is not null, false is puzzle is null
	 */
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
	
	/**
	 * getter method for the item in the room. If item is null, there is no item in the room.
	 * @return item
	 */
	public Item getItem()
	{
		return item;
	}
	
	/**
	 * checks whether or not the room has an item in it. If false is returned, there is no
	 * item in the room
	 * @return true if item is not null, false is item is null
	 */
	public boolean hasItem()
	{
		if (item != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * checks whether or not the room is passable
	 * @return passable
	 */
	public boolean isPassable()
	{
		return passable;
	}
	
	/**
	 * sets the room to be passable or not passable. If a puzzle or enemy is in
	 * the room, the room is not passable. Otherwise, it is passable
	 */
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
