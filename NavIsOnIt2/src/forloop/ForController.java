package forloop;

public class ForController {
public static void main(String args[]) {
	int var=0;
	//int counter=1;
	/* WHILE LOOP 
	while(counter<=10) {
		System.out.printf("%d",counter);
		counter++;
	}
	
	for(int i=1;i<=10;i++) {
		System.out.printf("%d ", i);
		
	}
	*/
	//sum 5.5
	//for(int i=2;i<=20;var+=i,i+=2) 
	for(int i=2;i<=20;i+=2) {
		System.out.println(i);
		var +=i;
		}
		System.out.print(var);
	
}
}
