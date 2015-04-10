import java.util.ArrayList;
import java.util.Collections;


public class Level {

	private ArrayList<Room> rooms;
	private Store store;
	
	/**
	 * creates a level with a list of rooms and a store, which comprise it
	 * @param setOfRooms
	 * @param aStore
	 */
	public Level(ArrayList<Room> setOfRooms, Store aStore)
	{
		this.rooms = setOfRooms;
		this.store = aStore;
	}
	
	/**
	 * randomizes the structure of the level by shuffling the rooms
	 */
	public void randomize()
	{
		Collections.shuffle(rooms);
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
}
