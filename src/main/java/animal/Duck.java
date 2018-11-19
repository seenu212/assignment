package animal;

public class Duck extends Bird{

	@Override
	public String sing()
	{
		return Constants.DUCK_SOUND;
	}
	public String swim()
	{
		return Constants.SWIM;
	}
}
