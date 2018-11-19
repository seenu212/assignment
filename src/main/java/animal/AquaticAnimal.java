package animal;


public class AquaticAnimal implements Animal {
	
public String sing() {
			// cannot sing
			return null;
		}	
public String fly() {
		//cannot fly
		return null;
	}
public String walk() {
	//cannot walk
	return null;
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
	public String swim()
	{
		return Constants.SWIM;
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
