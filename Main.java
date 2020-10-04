
/**
 * RockPaperScissors
 * 
 * @author Felix An 
 * @version 1.0
 * Licenced under the MIT License: https://opensource.org/licenses/MIT
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String multiplayerChoice = "";
        
        System.out.println("Welcome to RockPaperScissors. Type 1 to play against the computer, or type 2 to play against a friend.");
        
        while (!(multiplayerChoice.equals("1") || multiplayerChoice.equals("2"))) {
            multiplayerChoice = br.readLine();
            if (!(multiplayerChoice.equals("1") || multiplayerChoice.equals("2"))) {    // to prevent invalid choices
                System.out.println("Invalid choice! Type either 1 or 2!");
            }
        }
        
        boolean computerPlay;   // true if the user wants to play against the computer, false otherwise
        // the two objects below are used by the computer player
        String[] cpuChoices = {"r", "p", "s"};  // this array stores the choices that the computer is able to make
        Random rand = new Random(); // used by the computer to choose randomly
        
        if (multiplayerChoice.equals("2")) {
            computerPlay = false;
        } else {
            computerPlay = true;
        }
        
        System.out.println("OK, time to play.");

        // make string objects to store the choices
        String player1choice = "";
        String player2choice = "";
        
        // the actual game loops forever until the user wants to quit by typing q
        for (;;) {
            System.out.println("Player One: (r)ock, (p)aper, (s)cissors or (q)uit game?");
            while (!(player1choice.equals("r") || player1choice.equals("p") || player1choice.equals("s") || player1choice.equals("q"))) {   // loop until a valid choice is chosen
                player1choice = br.readLine().toLowerCase();
                if ((!(player1choice.equals("r") || player1choice.equals("p") || player1choice.equals("s") || player1choice.equals("q")))) {
                    System.out.println("Invalid choice! Type either r, p, s or q!");
                }
            }
            
            // return out of the main function if the user wants to quit
            if (player1choice.equals("q")) {
                System.out.println("Thanks for playing!");
                return;
            }
            
            if (computerPlay != true) {  // allow player 2 to pick if not playing against the computer
                System.out.println("Player Two: (r)ock, (p)aper, (s)cissors or (q)uit game?");
                while (!(player2choice.equals("r") || player2choice.equals("p") || player2choice.equals("s") || player2choice.equals("q"))) {
                    player2choice = br.readLine().toLowerCase();
                    if ((!(player2choice.equals("r") || player2choice.equals("p") || player2choice.equals("s") || player2choice.equals("q")))) {
                        System.out.println("Invalid choice! Type either r, p, s or q!");
                    }
                }
            
                if (player2choice.equals("q")) {
                    System.out.println("Thanks for playing!");
                    return;
                }

            // computer's action
            } else {
                player2choice = cpuChoices[rand.nextInt(3)]; // the computer player picks a random choice from the array of choices
                System.out.println("Computer chose " + player2choice);
            }

            // determine the outcome of the game
            if (player1choice.equals(player2choice)) {
                System.out.println("Tie");
            } else if (player1choice.equals("r")) {
                if (player2choice.equals("p")) {
                    System.out.println("Player 2 Wins");
                } else {
                    System.out.println("Player 1 Wins");
                }
            } else if (player1choice.equals("p")) {
                if (player2choice.equals("s")) {
                    System.out.println("Player 2 Wins");
                } else {
                    System.out.println("Player 1 Wins");
                }
            } else {
                if (player2choice.equals("r")) {
                    System.out.println("Player 2 Wins");
                } else {
                    System.out.println("Player 1 Wins");
                }
            }

            // clear the strings for the next round
            player1choice = "";
            player2choice = "";
            System.out.println("Time for the next round...");
        }
    }
}
