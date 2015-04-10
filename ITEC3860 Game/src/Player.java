public class Player extends Entity {


	public Player(String name) {
		super(name);
	}

	@Override
	public void addItem(Item item) {
		super.addItem(item);
	}

	@Override
	public void removeItem(Item item) {
		super.removeItem(item);
	}

	@Override
	public void takeDamage(int hit) {
		super.takeDamage(hit);
	}


	@Override
	public String getGreeting() {
		System.out.println("Hello World");
		return null;
	}


}