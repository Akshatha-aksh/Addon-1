package session3;

public class Nestedforloop {
	public static void main(String[] args) {
		int num = 6; //rows
		
		for(int i = 0; i<=num; i++) {
				for(int j = 1; j<=num-i; j++) {
					System.out.print("* ");
				}
				System.out.println();
		}
		
		
	}
}
