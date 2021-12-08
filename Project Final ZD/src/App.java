
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player playerOne = new Player();
		playerOne.setplayerName("Player One");
		Player playerTwo = new Player();
		playerTwo.setplayerName("Player Two");
		
for (int i = 0; i < 52; i++) {
	if (i % 2 == 0) {
		playerOne.draw(deck);
	}
	else {
		playerTwo.draw(deck);
	}
}
	for (int j = 0; j< 26; j++) {
		System.out.println();
		Card card1 = playerOne.flip();
		playerOne.description(card1);
		
		Card card2 = playerTwo.flip();
		playerTwo.description(card2);
		if(card1.getRank() > card2.getRank()) {
			playerOne.incrementScore();
			System.out.println(playerOne.getplayerName() + " gets a point! Current score: " + playerOne.getScore());
		}
		else if (card1.getRank() < card2.getRank()) {
			playerTwo.incrementScore();
			System.out.println(playerTwo.getplayerName() + " gets a point! Current score: " + playerTwo.getScore());
		}
		else {
			System.out.println("It's a tie! No points have been added.");
		}
	}
	System.out.println("\n Game over \n");
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player One wins! Final Score: " + playerOne.getScore());
		}
		else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("Player Two wins! Final Score: " + playerTwo.getScore());
		}
		else {
			System.out.println("It's a tie! Both players have finished with a score of: " + playerOne.getScore());
			
		}
	}
	}


