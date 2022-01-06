package methodsdeeper;

public class MethodOverload {

	public static void main(String[]args) { 
		

		System.out.printf("Square of int 7 is %d%n" , square(7)); 

		System.out.printf("Square of double 7.5 is %f%n" , square(7.5)); 

	}
 
    public static int square(int i) {
    System.out.println("This was called for int");
    	return i* i;
    }
    
    public static double square(double i) {
    	System.out.println("This was called for double");
    	return  i*i;
    }

}
