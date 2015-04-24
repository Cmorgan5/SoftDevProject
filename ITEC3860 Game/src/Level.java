/**Class: Level
 * @author Jacob Fagan
 * @version 1.0
 * Course : ITEC 3150
 * Written: April 3, 2015
 *
 *
 * This class – Creates a level that is made up of rooms and a store. The rooms are predefined, but their
 * placement on the map will be randomized. The level also contains a store where the player can buy and
 * sell items. 
 *
 * Purpose: – Create and define a level with rooms and a store;
 */ 

import java.util.ArrayList;
import java.util.Collections;


public class Level {

	private ArrayList<Room> rooms;
	private Store store;
	private Player player;
	
	/**
	 * creates a level with a list of rooms and a store, which comprise it
	 * @param setOfRooms
	 * @param aStore
	 */
	public Level(ArrayList<Room> setOfRooms, Store aStore)
	{
		this.rooms = setOfRooms;
		this.store = aStore;
		for (int i = 0; i < rooms.size(); i++)
		{
			rooms.get(i).setPlacementID(i);
		}
	}
	
	/**
	 * randomizes the structure of the level by shuffling the rooms
	 */
	public void randomize()
	{
		Collections.shuffle(rooms);
		for (int i = 0; i < rooms.size(); i++)
		{
			rooms.get(i).setPlacementID(i);
		}
	}
	
	/**
	 * getter method for rooms
	 * @return rooms
	 */
	public ArrayList<Room> getRooms()
	{
		return rooms;
	}
	
	/**
	 * getter method for store
	 * @return store
	 */
	public Store getStore()
	{
		return store;
	}
	
	public boolean isComplete()
	{
		if (rooms.get(rooms.size()-1).isPassable() != true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
