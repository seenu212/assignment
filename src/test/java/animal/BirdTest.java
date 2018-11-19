package animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {

	

	
	@Test
	public void testDuckSing()
	{
		Duck d = new Duck();
		assertEquals("Sing is not workning for Duck", "Quack, quack", d.sing());
		
	}
	@Test
	public void testChickenSing()
	{
		Chicken c = new Chicken(Chicken.GenderOption.MALE);
		assertEquals("Sing is not workning for roster", "Cock-a-doodle-doo", c.sing());
		
	}
	

}
