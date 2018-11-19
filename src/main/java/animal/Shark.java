package animal;


public class Shark extends Fish {
	public Shark(Size size, Color color) {
		this.setColor(color);
		this.setSize(size);
		
	}
	public Shark() {
		this.setColor(Color.GREY);
		this.setSize(Size.LARGE);
		
	}
	@Override
	String eat() {
		return(Constants.SHARK_EATS);
		
	}

}
