
public class Navigator {

	private Player player;
	private Level level;

	public Navigator(Player aPlayer, Level aLevel)
	{
		this.player = aPlayer;
		this.level = aLevel;
	}

	public void setLevel(Level newLevel)
	{
		level = newLevel;
	}
	public String movePlayer(String direction)
	{
		if (direction.equalsIgnoreCase("forward"))
		{
			if (player.getLocation().isPassable() == false)
			{
				return "Cannot proceed.";
			}
			else if ((player.getLocation().getPlacementID() + 1) >= level.getRooms().size())
			{
				if (level.isComplete() != true)
				{
					return "Cannot proceed.";
				}
				else
				{
					if (level.getStore() == null)
					{
						return "Congratulations! You won!";
					}
					else
					{
						return "Level complete. Visiting store." + "\n" + level.getStore().getDescription();
					}
				}
			}
			else
			{
				player.setLocation(level.getRooms().get(player.getLocation().getPlacementID()+1));
				return player.getLocation().getDescription();
			}
		}
		else if (direction.equalsIgnoreCase("back") || direction.equalsIgnoreCase("backward"))
		{
			if ((player.getLocation().getPlacementID() - 1) < 0)
			{
				return "Cannot go back.";
			}
			else
			{
				player.setLocation(level.getRooms().get(player.getLocation().getPlacementID()-1));
				return player.getLocation().getDescription();
			}
		}
		else 
		{
			return "Command not recognized";
		}
	}
}
