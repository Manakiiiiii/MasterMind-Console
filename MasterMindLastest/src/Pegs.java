import java.util.Arrays;

/**
 * Pegs class creates the peg object to be used in the game MasterMind.
 * 
 * @author Manaki IKeda
 *
 */
public class Pegs {


	private char pegColor;
	private static final String colors = "RGBYOP";
	
	/**
	 * Constructor which creates a peg object which holds an random number from colors instance
	 */
	public Pegs() {
		
		int random = (int)(Math.random()*6);
		pegColor = colors.charAt(random);
	}

	/**
	 * Creates a peg object which holds the color from parameter ch
	 * @param ch is a user input needs to be R,G,Y,O,P,B
	 * @throws Exception If the input is incorrect returns a error
	 */
	public Pegs(char ch) {
		
		if (checkChar(ch))
		{
			pegColor = ch;
		} else
			try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
	/**
	 * Method which returns true if the input is correct else return false
	 * @param ch is a user input it needs to be R,G,Y,O,P,B
	 * @return returns true when ch is a correct input else return false
	 * @pre parameter Character object ch needs to be a valid color 
	 * @post returns true if ch holds a valid color else return false
	 */
	public boolean checkChar(char ch) {
		return colors.indexOf(ch) !=-1;
	}
	
 
	/**
	 * This method compares two peg objects and return true if both are same else return false
	 * @param peg Peg object which holds a color 
	 * @return returns true if both pegs color matches else return false
	 * @throws Exception when the input is null NullPointerEception will be called
	 */
	public boolean comparePegs(Pegs peg) throws Exception {
		
		if(peg == null) {
			throw new NullPointerException();
		}
		
		return this.getColor()==peg.getColor();
	}

	/**
	 * This method returns a color that peg object holds
	 * @return returns the color which the called peg holds
	 */
	public char getColor() {
		return this.pegColor;
	}

	




}
