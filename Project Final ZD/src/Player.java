import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
	//private List<Card> hand = new ArrayList<Card>(Arrays.asList());
	private List<Card> hand = new ArrayList<Card>();
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	private int score = 0;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	private String playerName;
	public String getplayerName() {
		return playerName;
	}
	public void setplayerName(String name) {
		this.playerName = name;
	}
	
	public Player(){}
	public Player(List<Card> hand, int score, String playerName) {
		this.playerName = playerName;
		this.hand = hand;
		this.score = 0;
	}
	public void description(Card card) {
		System.out.println(this.playerName + " draws " + card.describe());
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public int incrementScore() {
		return this.score +=1;
	}
}
