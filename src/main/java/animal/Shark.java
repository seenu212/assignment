package animal;


public class Shark extends Fish {
	public Shark(Size size, Color color) {
		this.setColor(color);
		this.setSize(size);
		
	}
	@Override
	String eat() {
		return(Constants.SHARK_EATS);
		
	}

}
