package Arrays;

import java.security.SecureRandom;

public class deckodcards {

	public card[] deck;
	private int currentCard;
	public static final int NUMBER_OF_CARDS=52 ;
	private static final SecureRandom random= new SecureRandom();

	//constructor to fill cards
	public deckodcards() {
		String[] faces= {"Ace","Duece","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suits= {"Hearts","Diamonds","Spades","Clubs"};

		deck=new card[NUMBER_OF_CARDS];
		currentCard=0;
		for(int i=0;i<deck.length;i++) {
			deck[i]= new card(faces[i%13],suits[i/13]);
		}
	}

    //method to shuffle the cards
	public void shuffle() {
		currentCard=0;
		for(int i=0; i<deck.length;i++) {
			int second= random.nextInt(NUMBER_OF_CARDS);
			card temp= deck[i];
			deck[i]=deck[second];
			deck[second]= temp;

		}
	}

    //pulls the next card to deal with
	public card dealCard(){
		if(currentCard<deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}

}
