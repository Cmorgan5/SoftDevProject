/**Class: Enemy
 * @author Jacob Fagan
 * @version 1.0
 * Course : ITEC 3150
 * Written: April 3, 2015
 *
 *
 * This class – An enemy character. An enemy has a name, health, a difficulty level, and a type. The difficulty level
 * determines how difficulty it will be to defeat the enemy, and the type determines how they fight.
 *
 * Purpose: – Create and define an enemy with a name, health, a difficulty level, and a type.
 */ 

public class Enemy extends Character 
{

	private int difficulty;
	private String type;

	/**
	 * creates an enemy with a name, difficulty level, and type.
	 * @param aName
	 * @param aDifficulty
	 * @param aType
	 */
	public Enemy(String aName, int aDifficulty, String aType)
	{
		super();
		this.difficulty = aDifficulty;
		this.type = aType;
	}

	/**
	 * getter for the difficulty level of the enemy
	 * @return difficulty
	 */
	public int getDifficulty() 
	{
		return difficulty;
	}

	/**
	 * setter for the difficulty level of the enemy
	 */
	public void setDifficulty(int difficulty) 
	{
		this.difficulty = difficulty;
	}

	/**
	 * getter for the type of the enemy
	 * @return type
	 */
	public String getType() 
	{
		return type;
	}

	public String getGreeting()
	{
		return name + " stands in the room.";
	}
}
