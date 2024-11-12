/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargame;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author dhairyataak
 */
public class WarPlayer extends Player{
//    this is the child  class for the player class it has the player class as the parent class and has inheritance
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
        for (Card card : cards) {
            hand.add(card);
        }
    }

    public boolean isOutOfCards() {
        return hand.isEmpty();
    }


    public int getCardCount() {
        return hand.size();
    }

    
    public void play() {
       
    }
    public void shuffleDeck(){
        Collections.shuffle(getHand(), null);
    }
}
