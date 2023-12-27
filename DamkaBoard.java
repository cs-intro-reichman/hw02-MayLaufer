/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if ((i+1) % 2 != 0) { // for odd rows, the space is after the *. started from row 1
						System.out.print("* ");
					} else {
						System.out.print(" *");
					}
			}
			
		System.out.println();
	
		}
		
	}
}
