import java.util.Scanner;

/**
 * The Main Class which creates game MasterMind
 * @author 池田愛樹
 *
 */
public class MasterMind {
	
	private static int counter = 0;
	
	public static void main(String args[]) throws Exception {
	
		Board gameBoard = new Board();
		Sequence answer = new Sequence();
		Scanner sc = new Scanner(System.in);
		Sequence guess;
		
		System.out.println(answer);
		gameBoard.printRules();
		
		while(counter < 8) {
			
		gameBoard.printAskInput();
		String input = sc.nextLine();
		guess = new Sequence(input);
		
		System.out.println(guess.chceck(answer));
		if(guess.chceck(answer).equals("BBBB")) {
			gameBoard.printWin();
			System.exit(1);
		}
		counter++;
		}
		gameBoard.printLose();
		System.out.print(answer);
	}

}
