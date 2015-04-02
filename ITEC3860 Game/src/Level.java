import java.util.ArrayList;


public class Level {

	private ArrayList<Room> rooms;
	private ArrayList<Puzzle> puzzles;
	private ArrayList<Enemy> enemies;
	private ArrayList<Item> items;
	private Store store;
	
	public Level(ArrayList<Room> r, ArrayList<Puzzle> p, ArrayList<Enemy> e, ArrayList<Item> i, Store s)
	{
		this.rooms = r;
		this.puzzles = p;
		this.enemies = e;
		this.items = i;
		this.store = s;
	}
	
	public ArrayList<Room> getRooms()
	{
		return rooms;
	}

	public ArrayList<Puzzle> getPuzzles() 
	{
		return puzzles;
	}

	public ArrayList<Enemy> getEnemies() 
	{
		return enemies;
	}

	public ArrayList<Item> getItems() 
	{
		return items;
	}
}
