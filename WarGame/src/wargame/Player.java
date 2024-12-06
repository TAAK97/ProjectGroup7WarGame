package wargame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    public int getCardCount() {
        return hand.size();
    }

    public String showHand() {
        return hand.toString();
    }
}
