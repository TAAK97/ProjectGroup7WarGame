package wargame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WarGame warGame = new WarGame("War Game");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of player 1: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the name of player 2: ");
        String name2 = sc.nextLine();

        warGame.initializePlayers(name1, name2);
        warGame.initializeDeck();

        System.out.println("Welcome to the War Game!");
        System.out.println("Instructions:");
        System.out.println("Type 'play' to play a round.");
        System.out.println("Type 'shuffle' to shuffle the deck.");
        System.out.println("Type 'show' to view each player's current hand.");
        System.out.println("Type 'quit' to end the game.");

        while (true) {
            System.out.print("\nEnter your choice (play/shuffle/show/quit): ");
            String input = sc.nextLine().toLowerCase();

            switch (input) {
                case "play" -> {
                    warGame.showHands();
                    warGame.play();
                }
                case "shuffle" -> warGame.shuffleDeck();
                case "show" -> warGame.showHands();
                case "quit" -> {
                    System.out.println("Game is ending...");
                    warGame.declareWinner();
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid input.");
            }
        }
    }
}
