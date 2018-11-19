package animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParrotTest {
	Parrot p;

	@Before
	public void setUp() throws Exception {
		p = new Parrot();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	
	@Test
	public void testParrotSingDog()
	{
		p.setNeighbour(ParrotNeighbourhood.dogNeighbourhood);
		assertEquals("Sing is not workning for parrot", "Woof, woof", p.sing());
		
	}
	@Test
	public void testParrotSingCat()
	{
		p.setNeighbour(ParrotNeighbourhood.catNeighbourhood);
		assertEquals("Sing is not workning for parrot", "Meow", p.sing());
		
	}
	@Test
	public void testParrotSingRooster()
	{
		p.setNeighbour(ParrotNeighbourhood.roosterNeighbourhood);
		assertEquals("Sing is not workning for parrot", "Cock-a-doodle-doo", p.sing());
		
	}

}
