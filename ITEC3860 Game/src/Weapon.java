import java.util.ArrayList;
/**
 * 
 * @author Cory
 * 
 * Weapon class that would hold all of the weapons.
 * Will modify later to extend from Item class
 *
 */
public class Weapon  {

	
	
	public static void main(String[] args) {


		ArrayList<String> weapons = new ArrayList<String>();
		
		weapons.add("Sword");
		weapons.add("Gun");
		weapons.add("Weapon3");
		weapons.add("Weapon4");
		weapons.add("Weapon5");
		weapons.add("Weapon6");
		weapons.add("Weapon7");


		//Some sample test cases
		Item SwordWeapon = new Item(weapons.get(0), 0);
		Item GunWeapon = new Item(weapons.get(1), 0);

		System.out.println( SwordWeapon + " Damage: " + SwordWeapon.getValue() + " Hit Points.");
		System.out.println(GunWeapon + "Damage: " + SwordWeapon.getValue() + " Hit Points.");

	}




}
