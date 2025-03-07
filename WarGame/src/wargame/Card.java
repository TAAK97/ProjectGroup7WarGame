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
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, 
     * a regular playing card etc.
     */
    @Override
    public abstract String toString();

}