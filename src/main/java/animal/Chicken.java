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
	/*Default to female*/
	public Chicken()
	{
		this.gender = GenderOption.FEMALE;
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
	 public String fly() {
		 return null;
		 }
	
}
