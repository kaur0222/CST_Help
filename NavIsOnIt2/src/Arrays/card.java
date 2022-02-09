package Arrays;

public class card {

	private final String face;
	private final String suit;
	
	public card(String cardface,String cardsuit){
		this.face=cardface;
		this.suit=cardsuit;
	}
	
	public String toString() {
		
		return face+"of"+suit;
	}
	
}
