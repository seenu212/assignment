package animal;

public class Chicken extends Bird {
	
	private GenderOption gender;
	public static enum GenderOption
	{
		MALE,FEMALE;
	}
	
	public Chicken(GenderOption gender)
	{
		this.gender = gender;
	}
	
	@Override
	public String sing()
	{
		if(this.gender != null && this.gender.equals(GenderOption.MALE))
			return Constants.ROOSTER_SOUND;
		else
			return Constants.CHICKEN_SOUND;
	}
	@Override
	 void fly() {
		 System.out.println("I cannot fly");
		 }
	
}
