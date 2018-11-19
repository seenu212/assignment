package animal;


public class AquaticAnimal extends Animal {
	
	
@Override
public void walk() {
	System.out.println("cannot walk");
}


	private Size size;
	private Color color;
	
	public static enum Size
	{
		SMALL,LARGE;
	}
	public static enum Color
	{
		GREY,ORANGE;
	}
	public void swim()
	{
		System.out.println("I am swimming");
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
}
