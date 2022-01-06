package methodsdeeper;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double number1= input.nextDouble();
		double number2= input.nextDouble();
		double number3= input.nextDouble();
		
		
		double result = getMaximumValue(number1,number2,number3);
		System.out.println(result);
	}
		public static double getMaximumValue(double x,double y,double z) {
		 return Math.max(z,Math.max(x, y));
		}
	
	
}
