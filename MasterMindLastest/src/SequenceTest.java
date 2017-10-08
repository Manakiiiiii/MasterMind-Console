import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;



public class SequenceTest {

	@Test(expected = IllegalArgumentException.class)
	public void test2() throws Exception 
	{
		
		Sequence answer = new Sequence("");
		Sequence answer2 = new Sequence("AAAAAAAAAAAAAAA");
		Sequence answer3 = new Sequence();
		
	}
		
	@Test
	public void test() throws Exception {
		
		String guess = "PPPG";
		Sequence answer = new Sequence("PPPR");
		Sequence answer1 = new Sequence("PPPY");
		Sequence answer2 = new Sequence("OOOO");
		Sequence answer3 = new Sequence("PYPP");
		Sequence answer4 = new Sequence();
		
		
		assertEquals("----",answer.chceck(answer2));
		assertEquals("BBB-", answer.chceck(answer1));
		assertEquals("BBBB", answer.chceck(answer));
		assertEquals("BWBW",answer1.chceck(answer3));
	}
	
	@Test(expected = NullPointerException.class)
	public void test3() throws Exception {
		Sequence answer1 = new Sequence(null);
		assertNull(answer1);	
	}
	
	
	

	
	







}
