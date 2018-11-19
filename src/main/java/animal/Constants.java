package animal;

import java.util.Locale;
import java.util.ResourceBundle;

public final class Constants {
	/* Singing Constants */
	public static final String DUCK_SOUND= "Quack, quack";
	public static final String CHICKEN_SOUND= "Cluck, cluck";
	public static String ROOSTER_SOUND= "Cock-a-doodle-doo";
	public static final String DOG_SOUND= "Woof, woof";
	public static final String CAT_SOUND= "Meow";
	public static final String PARROT_SOUND= "Parrot sound";
	
	/* Eating Constants */
	public static final String SHARK_EATS ="Other Fish";
	
		
	/* Generic */
	public static final String GENERIC_SOUND= "I am Singing";
	public static final String WALK= "I am walking";
	public static final String SWIM= "I am swimming";
	public static final String FLY= "I am flying";

	static
	{
		Locale.getDefault();
		ResourceBundle mybundle = ResourceBundle.getBundle("Rooster");
		ROOSTER_SOUND = mybundle.getString("sound");
	}
}
