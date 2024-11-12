package wargame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
/**
 *
 * @author dhairyataak
 */
import java.util.ArrayList;
public abstract class Game {
//this is an abstract class that has some methods that should be implemented compulsorly by its child classes like wargame.
   private final String name; // Name of the game
    private ArrayList<Player> players; // List of players in the game

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    // Abstract methods to be implemented in subclasses
    public abstract void play();
    public abstract void declareWinner();
}//end class

