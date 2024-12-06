package wargame;

import java.util.List;

public class WarGame {
    private GroupOfCards deck;
    private Player player1;
    private Player player2;

    public WarGame(String name) {
        this.deck = new GroupOfCards();
    }

    public void initializePlayers(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void initializeDeck() {
        deck.shuffle();
        dealCards();
    }

    private void dealCards() {
        List<Card> cards = deck.getCards();
        for (int i = 0; i < cards.size(); i++) {
            if (i % 2 == 0) {
                player1.addCard(cards.get(i));
            } else {
                player2.addCard(cards.get(i));
            }
        }
    }

    public void showHands() {
        System.out.println(player1.getName() + "'s hand: " + player1.showHand());
        System.out.println(player2.getName() + "'s hand: " + player2.showHand());
    }

    public void shuffleDeck() {
        deck.shuffle();
        System.out.println("Deck has been shuffled.");
    }

    public void play() {
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        if (card1 == null || card2 == null) {
            System.out.println("No cards left to play!");
            return;
        }

        System.out.println(player1.getName() + " played: " + card1);
        System.out.println(player2.getName() + " played: " + card2);

        if (card1.getRank() > card2.getRank()) {
            System.out.println(player1.getName() + " wins this round!");
            player1.addCard(card1);
            player1.addCard(card2);
        } else if (card1.getRank() < card2.getRank()) {
            System.out.println(player2.getName() + " wins this round!");
            player2.addCard(card1);
            player2.addCard(card2);
        } else {
            System.out.println("It's a tie!");
        }
    }

    public void declareWinner() {
        int player1Cards = player1.getCardCount();
        int player2Cards = player2.getCardCount();

        if (player1Cards > player2Cards) {
            System.out.println(player1.getName() + " is the winner with " + player1Cards + " cards!");
        } else if (player2Cards > player1Cards) {
            System.out.println(player2.getName() + " is the winner with " + player2Cards + " cards!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
