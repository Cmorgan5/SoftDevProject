
public class PlayableCharacter extends Entity {


	public PlayableCharacter(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	


	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		super.addItem(item);
	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		super.removeItem(item);
	}

	@Override
	public void takeDamage(int hit) {
		// TODO Auto-generated method stub
		super.takeDamage(hit);
	}


	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		return null;
	}


}