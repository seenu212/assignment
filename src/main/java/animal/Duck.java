package animal;

public class Duck extends Bird{

	@Override
	public String sing()
	{
		return Constants.DUCK_SOUND;
	}
	public void swim()
	{
		System.out.println("I can swim");
	}
}
