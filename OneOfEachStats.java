import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		double totalChildren = 0.0; // To calculate the avg later
		
		int twoChildrenFamilies = 0;
		int threeChildrenFamilies = 0;
		int fourAndMoreChildrenFamilies = 0;
		int mostCommonNumberOFChildren = 0;
		
		boolean isGirl = true;
		boolean comparison = true;
		int childCountForOneFamily = 1; 
			
		for (int i = 0; i < T; i++) {
		
			while (isGirl || comparison) { 
					
				double probabilty = generator.nextDouble();
				
				if (probabilty > 0.5) {
					comparison = false;
				} else {
					isGirl = false;
				}
			
				childCountForOneFamily++;
			
			}
			
			totalChildren += childCountForOneFamily;
			
			if (childCountForOneFamily == 2) {
				twoChildrenFamilies++;
			} else if (childCountForOneFamily == 3) {
				threeChildrenFamilies++;
			} else if (childCountForOneFamily == 4) {
				fourAndMoreChildrenFamilies++;
			}
				
			childCountForOneFamily = 1; // Must initialized at the end of each test
			
		}
		
		double avgChildrenInAllFamilies = totalChildren / T;
		System.out.println("Average: " + avgChildrenInAllFamilies + " children to get at least one of each gender.");
		
		System.out.println("Number of families with 2 children: " + twoChildrenFamilies);
		
		System.out.println("Number of families with 3 children: " + threeChildrenFamilies);
		
		System.out.println("Number of families with 4 or more children: " + fourAndMoreChildrenFamilies);
		
		String commonNumber; // Temp variable 
		if (twoChildrenFamilies >= threeChildrenFamilies) {
			if (twoChildrenFamilies >= fourAndMoreChildrenFamilies) {
				commonNumber = "2";
			} else { 
				commonNumber = "4 or more";
			}
		} else {
			if (threeChildrenFamilies >= fourAndMoreChildrenFamilies) {
				commonNumber = "3";
			} else {
				commonNumber = "4 or more";
			}
		}
	
		System.out.println("The most common number of children is " + commonNumber + ". ");  

		
	}
}
		