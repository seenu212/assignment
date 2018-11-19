package animal;


public class Shark extends Fish {
	public Shark(Size size, Color color) {
		this.setColor(color);
		this.setSize(size);
		
	}
	@Override
	void eat() {
		System.out.println(Constants.SHARK_EATS);
		
	}

}
