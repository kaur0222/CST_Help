package methodsdeeper;

import java.security.SecureRandom;

public class RollDie {
 public static void main(String[]args) {
	 SecureRandom randomnum  = new SecureRandom();	 
	 
	 int times1=0;
	 int times2=0;
	 int times3=0;
	 int times4=0;
	 int times5=0;
	 int times6=0;
	 
	 for(int i =1; i<=6000000; i++) {
		int face = 1 + randomnum.nextInt(6);
		
		switch(face) {
		
		case 1:
			times1++;
			break;
			
		case 2:
			times2++;
			break;
			
		case 3:
			times3++;
			break;
			
		case 4:
			times4++;
			break;
			
		case 5:
			times5++;
			break;
			
		case 6:
			times6++;
			break;
		   
		}
		
	 }
	
	 System.out.println("Face \tFrequency");
	 System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", times1,times2, times3, times4, times5, times6);
 }
}
