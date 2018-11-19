package animal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import animal.AquaticAnimal.Color;
import animal.AquaticAnimal.Size;

public class FishTest {

	

	
	@Test
	public void testShark()
	{
		Fish f = new Shark(Size.LARGE, Color.GREY);
		assertEquals("Shark is Not large", Size.LARGE, f.getSize());
		assertEquals("Shark is Not GREY", Color.GREY, f.getColor());
		assertEquals("Shark problem swim","I am swimming",f.swim());
		assertNotEquals("I am walking",f.walk());
		
	}
	@Test
	public void testClownFish()
	{
		ClownFish f = new ClownFish(Size.SMALL, Color.ORANGE);
		assertEquals("Clown is Not small", Size.SMALL, f.getSize());
		assertEquals("Clown is Not orange", Color.ORANGE, f.getColor());
		assertEquals("Clown problem swim","I am swimming",f.swim());
		assertEquals("Clown problem joke","I am joking",f.joke());
		
	}
}
