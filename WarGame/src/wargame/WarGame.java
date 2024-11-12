/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wargame;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author dhairyataak
 */
public class WarGame {
//this is the wargame class
    private String name;
    private Player player1;
    private Player player2;
    private int player1Wins = 0;
    private int player2Wins = 0;
    private int rounds = 4;
    private GroupOfCards deck;
    // constructor
    public WarGame(String name) {
        this.name = name;
        this.deck = new GroupOfCards();
    }

    // initialize the players
    public void initializePlayers(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    // initialize the deck and shuffle the deck and then distribute the cards to the players
    public void initializeDeck() {
        deck.shuffle();
        List<Card> cards = deck.getCards();

        for (int i = 0; i < cards.size(); i++) {
            if (i % 2 == 0) {
                player1.addCard(cards.get(i));
            } else {
                player2.addCard(cards.get(i));
            }
        }
    }
// play function that has the logic of the game and has all the print and formatting information that has each player to play card on basis of random card and then all the sequential process that decides weather the player wins or not.
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting War game.");

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round + ":\n");

            
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            
            if (card1 == null || card2 == null) {
                System.out.println("One player has run out of cards. Ending game.");
                break;
            }

            System.out.println(player1.getName() + " plays: " + card1+"\n");
            System.out.println(player2.getName() + " plays: " + card2+"\n");

           
            if (card1.getRank() > card2.getRank()) {
                System.out.println(player1.getName() + " WINS!!\n");
                player1Wins++;
                player1.addCard(card1);
                player1.addCard(card2);
            } else if (card1.getRank() < card2.getRank()) {
                System.out.println(player2.getName() + " WINS!!\n");
                player2Wins++;
                player2.addCard(card1);
                player2.addCard(card2);
            } else {
                System.out.println("GAME TIED\n");
            }

            // Prompt the user to continue or shuffle
            if(round==rounds){
                System.out.println("GAME OVER");
                break;
            }
            System.out.println("\n\n====================TYPE 'p' TO PLAY NEXT ROUND==================\n            OR          \n======================'s' TO SHUFFLE THE DECKOR==================\n            OR          \n=================='q' TO QUIT THE GAME===========================\n            OR          \n==================='sh' TO SHOW HANDS============================");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("s")) {
                System.out.println("SHUFFLING THE DECK");
                deck.shuffle();
            } 
            else if(input.equals("sh")){
                showHands();
            }
            else if(input.equals("q")){
                System.out.println("-------------------GAME IS NOW ENDING-------------------");
                this.declareWinner();
                System.exit(0);
                return;
            }
            else if (!input.equals("p") || !input.equals("s") || !input.equals("q") || !input.equals("sh")) {
                System.out.println("INVALID INPUT MOVING TO NEXT ROUND");
            }

        }


        System.out.println("\nGAME IS OVER - ALL ROUNDS PLAYED\n-------------------------------------------THE SCORES ARE:-------------------------------------------");
        System.out.println(player1.getName() + " WON " + player1Wins + " WON ");
        System.out.println(player2.getName() + " WON " + player2Wins + " ROUNDS.");

        if (player1Wins > player2Wins) {
            System.out.println("------------------------------OVERALL WINNER IS: " + player1.getName()+"------------------------------");
        } else if (player2Wins > player1Wins) {
            System.out.println("---------------------OVERALL WINNER IS: " + player2.getName()+"---------------------");
        } else {
            System.out.println("-------------------GAME TIED!!!!----------------");
        }
    }
// shiffle the deck
    public void shuffleDeck() {
        deck.shuffle();
    }
    // declare the winner on the basis of the number of cards
    public void declareWinner() {
        int player1Cards = player1.getHand().size();
        int player2Cards = player2.getHand().size();

        System.out.println("\nFinal Result:");
        System.out.println(player1.getName() + " HAS " + player1Cards + " CARDS.");
        System.out.println(player2.getName() + " HAS " + player2Cards + " CARDS.");

        if (player1Cards > player2Cards) {
            System.out.println(player1.getName() + " WON!");
        } else if (player1Cards < player2Cards) {
            System.out.println(player2.getName() + " WON!");
        } else {
            System.out.println("GAME DRAWN");
        }
    }
    public void showHands() {
        System.out.println("\nCURRENT HANDS:");
        
        System.out.println(player1.getName() + "'s HAND:");
        for (Card card : player1.getHand()) {
            System.out.println(" - " + card.toString());
        }
        
        System.out.println("\n" + player2.getName() + "'s HAND:");
        for (Card card : player2.getHand()) {
            System.out.println(" - " + card.toString());
        }
    }
    
}
