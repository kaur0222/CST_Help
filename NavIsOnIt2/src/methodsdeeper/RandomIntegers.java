package methodsdeeper;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[]args) {
		//random number object
     SecureRandom randomNumber = new SecureRandom();
     // for loop 20 times
     
     for(int i=1;i<=20;i++) {
    	 int face= 1 + randomNumber.nextInt(6);
    	 System.out.printf("%d ",face);
    	 
    	 if(i%5 == 0){
    		System.out.println(); 
    	 }
     }
      
	}

}
