
public class AccTest {
 public static void main (String[]args) {

 
	 Acc acc1 = new Acc("Nav",10.4);
	 Acc acc2 = new Acc("Bub",100.5);
 AccTest.jj(acc1);
 AccTest.jj(acc2);
	 
 }
 
public static void jj(Acc todisplay){
	
	 System.out.println(todisplay.getBal());
	 System.out.println(todisplay.getName());
 }
}
