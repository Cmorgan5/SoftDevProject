
public class Puzzle {

	private String description;
	private String solution;
	private boolean solved;
	
	public Puzzle(String des, String sol)
	{
		this.description = des;
		this.solution = sol;
		solved = false;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getSolution()
	{
		return solution;
	}
	
	public boolean isSolved()
	{
		return solved;
	}
	
	public void solve()
	{
		solved = true;
	}
}
