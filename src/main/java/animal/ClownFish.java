package animal;

public class ClownFish extends Fish{
	public ClownFish(Size size, Color color) {
		this.setColor(color);
		this.setSize(size);
		
	}
@Override
void eat() {
	// Implement clown eat
	
}
void joke()
{
	System.out.println("I make jokes");
}
}
