/**Class: Store
 * @author Jacob Fagan
 * @version 1.0
 * Course : ITEC 3150
 * Written: April 6, 2015
 *
 *
 * This class – Store that holds items for selling and buying. A store has a stock of items and a budget.
 * Items can be bought from the store and sold to the store, which will affect the store's stock and
 * budget as well as the player's inventory and money appropriately.
 *
 * Purpose: – Creates a store that has a stock of items and a budget.
 */ 

import java.util.ArrayList;


public class Store
{

	private String description;
	private ArrayList<Item> stock;
	private int budget;

	/**
	 * creates a store object with a list of items that make up its stock and a budget.
	 * @param aStock
	 * @param aBudget
	 */
	public Store(String aDescription, ArrayList<Item> aStock, int aBudget)
	{
		this.description = aDescription;
		this.stock = aStock;
		this.budget = aBudget;
	}

	/**
	 * getter for the store's stock of items.
	 * @return stock
	 */
	public ArrayList<Item> getStock()
	{
		return stock;
	}

	/**
	 * getter for the store's budget.
	 * @return budget
	 */
	public int getBudget()
	{
		return budget;
	}

	/**
	 * getter for the store's description
	 * @return description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * sells a specified item to a specified player. Removes sold item from stock, adds item's value to budget,
	 * adds item to the player's inventory, and removes item's value from the player's money. If the player does not
	 * have enough money to buy an item, the item will not be sold to the player.
	 * @param aPlayer
	 * @param anItem
	 * @return
	 */
	public String sellItem(Player aPlayer, Item anItem)
	{
		if (aPlayer.getMoney() < anItem.getValue())
		{
			return "You do not have enough money to buy this item.";
		}
		else
		{
			aPlayer.addItem(anItem);
			stock.remove(anItem);
			budget = budget + anItem.getValue();
			return anItem.getName() + " was bought from store for $" + anItem.getValue();
		}
	}

	/**
	 * buys a specified item from a specified player. Adds bought item to stock, removes item's value from budget,
	 * removes item from the player's inventory, and adds item's value to the player's money. If the store does not
	 * have enough money to buy the item, the item will not be bought from the player.
	 * @param aPlayer
	 * @param anItem
	 * @return
	 */
	public String buyItem(Player aPlayer, Item anItem)
	{
		if (anItem.getValue() > budget)
		{
			return "Store does not have enough money to buy this item.";
		}
		else
		{
			stock.add(anItem);
			aPlayer.removeItem(anItem);
			budget = budget - anItem.getValue();
			return anItem.getName() + " was sold to store for $" + anItem.getValue();
		}
	}
	
	public String toString()
	{
		return "Stock: " + stock + ", Store Money: " + budget;
	}
}
