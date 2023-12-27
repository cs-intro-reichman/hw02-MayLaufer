/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// if str.length-1 is odd - making sure the "first middle" char will be printed
		int middleCharIndex = (int)(Math.floor((str.length() - 1)/ 2)); 
		
		System.out.println("The middle character is " + str.charAt(middleCharIndex));
	
	}
}
