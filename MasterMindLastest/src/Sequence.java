import java.util.ArrayList;

/**
 * Sequence class creates an ArrayList of type Pegs which will be used in the game M
 * @author 池田愛樹
 *
 */
public class Sequence {
	
	private ArrayList<Pegs> alst = new ArrayList<Pegs>();
	
	
	/**
	 * Creates an array alst which stores 4 Peg object
	 */
	public Sequence() {
		
		for (int i=0; i < 4; i++) {
			alst.add(new Pegs());
		}
		
	}

	/**
	 * Creates an array alst which stores 4 peg object which holds the number based on the input 
	 * @param input input call the second constructor inside of the Pegs class
	 * @throws when input is null program will throw NullpointerException, when input is wrong program throws IllegalArgumentException
	 */
	
	@SuppressWarnings("unused")
	public Sequence(String input) throws Exception {
		if(input.length()<4 || input.length()>4) {
			throw new IllegalArgumentException();
		}
		if(input == null) {
			throw new NullPointerException();
		}
		
		for(int i=0; i <4; i++) {
			
			alst.add(new Pegs(input.charAt(i)));
			
			
		}
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Pegs p: this.alst) {
			sb.append(p.getColor());
	
		}

		return sb.toString();

	}
	
	
	/**
	 * @param peg is a Peg object that you want to compare with
	 * @return returns true if ArrayList object last holds the same color with parameter peg
	 * @throws Exception if the parameter is null throws a NullPointerException
	 * <pre> parameter needs to be a Pegs object
	 * <post> if the peg has same color compared to this.peg it returns true
	 */
	public boolean hasSameColor(Pegs peg ) throws Exception {
		if(peg == null) {
			throw new NullPointerException();
		}
		for (Pegs p: this.alst) {
			
			if(p.comparePegs(peg))
				return true;
		}
		return false;
	}
	/**
	 * This method compares to Sequence object and returns a hint 
	 * @param seq Sequence object which you want to compare
	 * @return returns a StringBuilder which holds the hint
	 * @throws Exception if the parameter list is null throws a NullPointerException
	 * <pre> parameter needs to be a Sequence object\
	 * <post> returns the hint based on user guess
	 */
	public String chceck(Sequence seq) throws Exception {
		
		if(seq.alst == null) {
			throw new NullPointerException();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<4;i++) {
			
			if(this.alst.get(i).comparePegs(seq.alst.get(i))) {
				
				sb.append('B');
				
			}
			else if (hasSameColor(seq.alst.get(i))){
				sb.append('W');
				
			
			}else {
			sb.append('-');
		}
		
		
		
	}
		return sb.toString();

	}
}	
		
	
	
	


