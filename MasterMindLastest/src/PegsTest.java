import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PegsTest {
	
	@Test(expected = NullPointerException.class)
	public void comparePegsTest() throws Exception {
		
		Pegs p1 = new Pegs('R');
		
		Pegs p2 = new Pegs('R');
		Pegs p3 = new Pegs('G');
		
		assertTrue(p1.comparePegs(p2));
		assertFalse(p1.comparePegs(p3));
		assertNull("eeee",p1.comparePegs(null));
		
		
	}

	@Test
	public void test() {
		
		Pegs peg = new Pegs();
		Pegs peg1 = new Pegs('R');
		Pegs peg2 = new Pegs('W');
		
		peg.checkChar('R');
		peg.getColor();

		
		
		
}
}