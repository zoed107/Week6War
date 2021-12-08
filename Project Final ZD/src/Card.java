import java.util.HashMap;
import java.util.Map;

public class Card {
	//cards
	private int rank;
	private Card.Suit suit;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Card.Suit getSuit() {
		return suit;
	}
	public void setSuit(Card.Suit heart) {
		this.suit = heart;
	}
	//describe
	public String toString() {
		return (this.rank + "of " + this.suit);
	}
	
	public String describe() { 
		Map<Integer, String> cardValueMap = new HashMap<Integer, String>();
		cardValueMap.put(2, "2");
		cardValueMap.put(3, "3");
		cardValueMap.put(4, "4");
		cardValueMap.put(5, "5");
		cardValueMap.put(6, "6");
		cardValueMap.put(7, "7");
		cardValueMap.put(8, "8");
		cardValueMap.put(9, "9");
		cardValueMap.put(10, "10");
		cardValueMap.put(11, "Jack");
		cardValueMap.put(12, "Queen");
		cardValueMap.put(13, "King");
		cardValueMap.put(14, "Ace");
		return (cardValueMap.get(this.rank) + " of " + this.suit);
		
	}
	public enum Suit {
		Spades("Spades"), Hearts("Hearts"), Clubs("Clubs"), Diamonds("Diamonds");
		private String suits;
		Suit(String suits) {
			this.suits = suits;	
		}
	public String getSuits() {
		return (suits);
		}
	}
}