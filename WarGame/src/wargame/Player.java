package wargame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
/**
 *
 * @author dhairyataak
 */
public class Player {

    private String name;
    private List<Card> hand = new ArrayList<>();
    // constructor
    public Player(String name) {
        this.name = name;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }
    // add card to hand
    public void addCard(Card card) {
        hand.add(card);
    }
    // play card from hand
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }
    // shuffle cards here also so that we can shuffle our deck from anywhere
    public void shuffleHand(){
        Collections.shuffle(getHand(), null);
    }
    
}
