package wargame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
/**
 * A class to be used as the base Card class for the project. 
 * Must be general enough to be instantiated for any Card 
 * Students wishing to add to the code should remember to add themselves as a modifier.
 *
 */
/**
 *
 * @author dhairyataak
 */
public class Card {
    private String suit;
    private int rank; // 2-14 where 11-14 represent Jack, Queen, King, Ace

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
        switch (rank) {
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            case 14: return "Ace";
            default: return String.valueOf(rank);
        }
    }

}