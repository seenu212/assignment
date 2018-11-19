package animal;

public class ClownFish extends Fish{
	public ClownFish(Size size, Color color) {
		this.setColor(color);
		this.setSize(size);
		
	}
	public ClownFish() {
		this.setColor(Color.ORANGE);
		this.setSize(Size.SMALL);
		
	}
@Override
String eat() {
	return null;
	
}
String joke()
{
	return("I am joking");
}
}
