
/**
 * Board class which implements BoardInterface Board will be called in the main class
 * @author 池田愛樹
 *
 */
public class Board implements BoardInterface {

	
	int counter = 0;
	public Board() {

	}

	/* (non-Javadoc)
	 * @see BoardInterface#printWin()
	 */
	public void printWin() {
		
		System.out.println("(･ω･)<Congratulations! You won the game! ");
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see BoardInterface#printLose()
	 */
	public void printLose() {
		System.out.print("You lose (´・ω・`) ");
		System.out.print("The answer was ");
	}
	/* (non-Javadoc)
	 * @see BoardInterface#printRules()
	 */
	public void printRules() {
		
		System.out.println("Hello and welcome to MasterMind (´-ω-)/");
		System.out.println("Made by Manaki Ikeda \n ");
		System.out.println("Master Mind is a game you guess four colors the game selected");
		System.out.println("If you're guess is correct you will win the game");
		System.out.print("You have 8 chances to guess");
		System.out.println(" These are the colors you can select\nR(red) G(green) B(blue) Y(yellow) P(pink) O(orange)");
		System.out.println("Each time you will guess 4 colors. For example�@�� RGBP");
		System.out.println("After guessing, game will give you a hint");
		System.out.println("W means you had the correct color,but in the wrong position");
		System.out.println("B means you had the correct color in correct position");
		System.out.println("Good luck and have fun! \\(´・ω・`)\n");
	
		
		
	}

	
	/* (non-Javadoc)
	 * @see BoardInterface#printAskInput()
	 */
	public void printAskInput() {
		counter++;
		System.out.println("What is your guess?"+" This is your guess " +counter);
		
		
		
		
	}
	
	
		
	}
