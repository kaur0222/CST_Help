package Arrays;

public class cardTest {
public static void main(String args[]) {
	deckodcards mycards= new deckodcards();
	mycards.shuffle();
	
	for(int i=1;i<=52;i++) {
		System.out.printf("%-19s",mycards.dealCard());
		if(i%4==0) {
			System.out.println();
		}
	}
}
}
