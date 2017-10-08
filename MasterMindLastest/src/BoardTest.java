import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void test() {
		
		Board testBoard = new Board();
		
		
		testBoard.printRules();
		testBoard.printAskInput();
		testBoard.printLose();
		testBoard.printWin();
		
		
	}

}
