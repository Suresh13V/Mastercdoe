package Reverse;

public class string {
	
	public static void main(String[] args) {
		
		String word = "SURESH ";
		String word1 = " MATHAN ";
	    String word2 = "";
	    
	    for(int i = word.length()-1; i>=0; i--) {
	    	
	    	word2 = word2 + word.charAt(i);
	    	
	    }
	    
	    
		/*
		 * for(int i = word1.length()-1; i>=0; i--) {
		 * 
		 * word2 = word2 + word1.charAt(i);
		 * 
		 * }
		 */
	    System.out.println(word2);
		 
	}

}
