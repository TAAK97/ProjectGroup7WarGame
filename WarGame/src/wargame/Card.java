package wargame;

public class Card {
    private String suit;
    private int rank; // 2-14, where 11-14 represent Jack, Queen, King, Ace

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rankToString() + " of " + suit;
    }

    private String rankToString() {
        return switch (rank) {
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            case 14 -> "Ace";
            default -> String.valueOf(rank);
        };
    }
}
