/**
 * 
 */

/**
 * @author Cory
 *
 */
public class Armor extends Item {

	
	private int defensePower;
	
	
	/**
	 * @param name
	 * @param value
	 */
	public Armor(String name, int value) {
		super(name, value);
		// TODO Auto-generated constructor stub
		
	this.value = defensePower;
	}

	
	
	public int getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}
	
//	Armor armguard = new Armor("Armguards", 20);
//	Armor mask = new Armor("Mask", 15);
//	Armor vest = new Armor("Vest", 35 );
	
	
}
