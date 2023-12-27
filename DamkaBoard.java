/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					System.out.print("* ");
			}
			
		System.out.println();
		
			if ((i+1) % 2 != 0) { // The * is first when the line number is odd. i starts in 0 so added +1
				System.out.print(" ");
			}
		}
		
	}
}
