import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	int rank[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	String suit[] = {"Spades", "Clubs", "Hearts", "Diamonds"};
	//Card[] deck = new Card[52];
	private List<Card> cards = new ArrayList<Card>();
	Deck () {
		//i couldn't figure out any other way to make this work other than maps
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
	for (int i = 2; i <= 14; i++) {
		Card card = new Card();
		card.setSuit(Card.Suit.Spades);
		card.setRank(i);
		cards.add(card);
	}
	for (int i = 2; i <= 14; i++) {
		Card card = new Card();
		card.setSuit(Card.Suit.Clubs);
		card.setRank(i);
		cards.add(card);
	}
	for (int i = 2; i <= 14; i++) {
		Card card = new Card();
		card.setSuit(Card.Suit.Diamonds);
		card.setRank(i);
		cards.add(card);
}
	for (int i = 2; i <= 14; i++) {
		Card card = new Card();
		card.setSuit(Card.Suit.Hearts);
		card.setRank(i);
		cards.add(card);
	}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}
}


