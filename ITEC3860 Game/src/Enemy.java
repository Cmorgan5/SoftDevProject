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

	/**
	 * creates an enemy with a name, difficulty level, and type.
	 * @param aName
	 * @param aDifficulty
	 * @param aType
	 */
	public Enemy(String aName)
	{
		super();
	}

	public String getGreeting()
	{
		return name + " stands in the room.";
	}
}
