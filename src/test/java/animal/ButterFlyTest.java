package animal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import animal.AquaticAnimal.Color;
import animal.AquaticAnimal.Size;

public class ButterFlyTest {

	Butterfly b;
	@Before
	public void setUp() throws Exception {
		b = new Butterfly();
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}


	
	@Test
	public void testCaterpillar()
	{
		assertEquals("catterpillar problem in walk",Constants.WALK,b.walk());
		assertNull(b.fly());
		
	}
	@Test
	public void testButterfly()
	{
		b.transform();
		assertEquals("Butterfly problem in fly",Constants.FLY,b.fly());
		assertNull(b.sing());
		
	}
}
