package wargame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class WarPlayer extends Player {
    private Queue<Card> hand;

    public WarPlayer(String name) {
        super(name);
        hand = new LinkedList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card drawCard() {
        return hand.poll();
    }

    public void collectCards(Card... cards) {
        Collections.addAll(hand, cards);
    }

    public boolean isOutOfCards() {
        return hand.isEmpty();
    }

    @Override
    public int getCardCount() {
        return hand.size();
    }
}
