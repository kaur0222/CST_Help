package whileLoop;

import java.util.Scanner;

public class AvgCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pass = 0;
		int failure= 0;
		int stucounter= 1;
	
		while (stucounter<=10) {
			System.out.print("Enter result: ");
			int result = input.nextInt();
			if(result==1) {
				pass+=1;
			}
			else 
				failure = failure+1;
			
		stucounter=stucounter+ 1;
		}

			System.out.printf("Passed:%d%nFailed:%d%n",pass, failure);
	
	if(pass>8) {
		System.out.println("Bonus to instructor :)");
	}
	}
}