/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargame;
import java.util.Scanner;
/**
 *
 * @author dhairyataak
 */
public class Main {
    public static void main(String[] args) {
        WarGame warGame = new WarGame("War Game");
        System.out.println("Enter the name of the player1 : \n");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("Enter the name of the player2 : \n");
        String name2 = sc.nextLine();

        warGame.initializePlayers(name1, name2);
        warGame.initializeDeck();

        System.out.println("Welcome to the War Game!");
        System.out.println("Instructions:");
        System.out.println("Type 'play' to play a round.");
        System.out.println("Type 'shuffle' to shuffle the deck.");
        System.out.println("Type 'show' to view each player's current hand.");
        System.out.println("Type 'quit' to end the game.");

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("\nEnter your choice (play/shuffle/show/quit): ");
            input = scanner.nextLine().toLowerCase();

            switch (input) {
    case "play" -> {
        warGame.showHands();
        warGame.play();
    }
    case "shuffle" -> {
        warGame.shuffleDeck();
        System.out.println("SHUFFLIED THE DECK");
    }
    case "show" -> warGame.showHands();
    case "quit" -> {
        System.out.println("GAME IS NOW ENDING");
        warGame.declareWinner();
        scanner.close();
        return;
    }
    default -> System.out.println("Invalid input.");
        }
        }
    }
}
