package wargame;

import java.util.ArrayList;

/**
 * Abstract class representing a generic game.
 * Demonstrates Inheritance to enforce a common structure across games.
 */
public abstract class Game {
    private final String name;
    private ArrayList<Player> players;

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

    public abstract void play();
    public abstract void declareWinner();
}
