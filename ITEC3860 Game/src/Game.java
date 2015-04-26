import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;









public class Game {

	private Level level;
	private Player player;
	private Navigator navigator;
	
//Would these type of entities work? or 
//do I need to actually make a Weapon and Armor entity 
//separately
//Item bandaid = new Item("Bandaid", 5);
//Item healthkit = new Item("Health Kit", 20);
//Item apple = new Item("Golden Apple", 50);



	public Game(Level aLevel, Player aPlayer)
	{
		this.level = aLevel;
		this.player = aPlayer;
		this.navigator = new Navigator(aPlayer, aLevel);
	}

	public void run() throws IOException
	{
		String message = "";
		System.out.println("Welcome to Bank Breaker! Enter 'begin' to start the game, or 'exit' to quit.");
		BufferedReader inFromUser = null;
		message = "";
		while (!message.equalsIgnoreCase("begin"))
		{
			inFromUser = new BufferedReader(new InputStreamReader(System.in));
			message = inFromUser.readLine();
			if (message.equalsIgnoreCase("begin"))
			{
				System.out.println("Starting game...");
				player.setLocation(level.getRooms().get(0));
				System.out.println(player.getLocation().getDescription());
			}
			else if (message.equals("exit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Command not recongnized.");
			}
		}
		while (!message.equalsIgnoreCase("exit"))
		{
			inFromUser = new BufferedReader(new InputStreamReader(System.in));
			message = inFromUser.readLine();
			if (message.equalsIgnoreCase("help"))
			{
				System.out.println("List of commands: \nLook: returns description of the room you "
						+ "are currently in. \nForward/Back: moves you forward or back through the "
						+ "level accordingly. You cannot move forward if you haven't solved the room's "
						+ "puzzle, if there is a puzzle. \nAttack: attacks the enemy in the room, if there is one. \nPick up: "
						+ "picks up the specified item if it is in the room and places it in your "
						+ "inventory. \nDrop: drops the spcified item. Once dropped, the item will remain "
						+ "in the room it was dropped in. \nEquip: equips the specified item if it is present in your "
						+ "inventory. \nStore: opens the store. \nBuy: buys the specified item from the store."
						+ "(can only be used if store is open) \nSell: sells the specified item to the "
						+ "store.(can only be used if store is open) \nDone: closes the currently opened "
						+ "store.(can only be used if store is open) \nExit: exits the game.");
			}
			else if (message.equalsIgnoreCase("look"))
			{
				System.out.println(player.getLocation().getDescription());
			}
			else if (message.equalsIgnoreCase("forward") || message.equalsIgnoreCase("back")
					|| message.equalsIgnoreCase("backward"))
			{
				System.out.println(navigator.movePlayer(message));
			}
			else if (message.equalsIgnoreCase("attack"))
			{
				if (player.getLocation().hasEnemy() != true)
				{
					System.out.println("Nothing to attack.");
				}
				else
				{
					player.getLocation().getEnemy().takeDamage(5);
					System.out.println("Attacked " + player.getLocation().getEnemy().getName()
							+ " for x damage.");
					player.takeDamage(5);
					System.out.println("Attacked by " + player.getLocation().getEnemy().getName()
							+ " for x damage.");
				}
			}
			else if (message.startsWith("answer is"))
			{
				if (player.getLocation().getPuzzle() != null)
				{
					String solution = message.substring(10, message.length());
					if (solution.equalsIgnoreCase(player.getLocation().getPuzzle().getSolution()))
					{

						player.getLocation().getPuzzle().solve();
						player.getLocation().setPassable();
						System.out.println("Puzzle solved.");
						player.getLocation().setPuzzle(null);
					}
					else
					{
						System.out.println("Incorrect solution.");
					}
				}
				else
				{
					System.out.println("No puzzle to solve.");
				}
			}
			else if (message.startsWith("pick up"))
			{
				String itemName = message.substring(8, message.length());
				if (player.getLocation().getItem() == null)
				{
					System.out.println("No item to pick up.");
				}
				else if (itemName.equalsIgnoreCase(player.getLocation().getItem().getName()))
				{
					player.pickUpItem(player.getLocation().getItem());
					System.out.println("Picked up " + player.getLocation().getItem().getName());
					player.getLocation().setItem(null);
				}
				else
				{
					System.out.println("That item is not recognized or is not in this room.");
				}
			}
			else if (message.startsWith("drop"))
			{
				String itemName = message.substring(5, message.length());
			}
			else if (message.startsWith("equip"))
			{
				String itemName = message.substring(6, message.length());
			}
			else if (message.equalsIgnoreCase("store"))
			{
				String itemName = "";
				boolean doneWithStore = false;
				while (doneWithStore != true)
				{
					System.out.println(level.getStore());
					System.out.println("Your money: " + player.getMoney());
					inFromUser = new BufferedReader(new InputStreamReader(System.in));
					message = inFromUser.readLine();
					if (message.startsWith("buy"))
					{
						String s = "";
						boolean hasItem = false;
						itemName = message.substring(4, message.length());
						for (int i = 0; i < level.getStore().getStock().size(); i++)
						{
							if (itemName.equalsIgnoreCase(level.getStore().getStock().get(i).getName()))
							{
								s = level.getStore().sellItem(player, level.getStore().getStock().get(i));
								hasItem = true;
							}
							else if (hasItem = false)
							{
								s = "Store does not possess item.";
							}
						}
						System.out.println(s);
					}
					else if (message.startsWith("sell"))
					{
						itemName = message.substring(5, message.length());
					}
					else if (message.equalsIgnoreCase("done"))
					{
						doneWithStore = true;
						System.out.println(player.getLocation().getDescription());
					}
				}
			}
			else if (message.equalsIgnoreCase("exit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Command not recognized.");
			}
		}
	}
}