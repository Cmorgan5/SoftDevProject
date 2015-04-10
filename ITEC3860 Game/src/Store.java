import java.util.ArrayList;


public class Store {

	private ArrayList<Item> stock;
	private int budget;

	public Store(ArrayList<Item> aStock, int aBudget)
	{
		this.stock = aStock;
		this.budget = aBudget;
	}

	public ArrayList<Item> getStock()
	{
		return stock;
	}

	public int getBudget()
	{
		return budget;
	}

	public String sellItem(Player aPlayer, Item anItem)
	{
		aPlayer.addItem(anItem);
		stock.remove(anItem);
		budget = budget + anItem.getValue();
		return anItem.getName() + " was bought from store for $" + anItem.getValue();
	}

	public String buyItem(Player aPlayer, Item anItem)
	{
		if (anItem.getValue() > budget)
		{
			return "Store does not have enough budget to buy item.";
		}
		else
		{
			stock.add(anItem);
			aPlayer.removeItem(anItem);
			budget = budget - anItem.getValue();
			return anItem.getName() + " was sold to store for $" + anItem.getValue();
		}
	}
}
