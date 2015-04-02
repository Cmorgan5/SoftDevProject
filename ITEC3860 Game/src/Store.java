import java.util.ArrayList;


public class Store {

	private ArrayList<Item> stock;
	
	public Store(ArrayList<Item> s)
	{
		this.stock = s;
	}
	
	public ArrayList<Item> getStock()
	{
		return stock;
	}
}
