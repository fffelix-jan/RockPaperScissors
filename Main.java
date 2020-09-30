
/**
 * RockPaperScissors
 * 
 * @author Felix An 
 * @version 1.0
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
            if (!(multiplayerChoice.equals("1") || multiplayerChoice.equals("2"))) {
                System.out.println("Invalid choice! Type either 1 or 2!");
            }
        }
        
        if (multiplayerChoice.equals("2")) {
            boolean computerPlay = false;
        } else {
            boolean computerPlay = true;
            String[] cpuChoices = {"r", "p", "s"};
            Random rand = new Random();
        }
        
        System.out.println("OK, time to play.");
        String player1choice = "";
        
        for (;;) {
            System.out.println("Player One: (r)ock, (p)aper, (s)cissors or (q)uit game?");
            while (!(player1choice.equals("r") || player1choice.equals("p") || player1choice.equals("s") || player1choice.equals("q"))) {
                player1choice = br.readLine().toLowerCase();
                if ((!(player1choice.equals("r") || player1choice.equals("p") || player1choice.equals("s") || player1choice.equals("q")))) {
                    System.out.println("Invalid choice! Type either r, p, s or q!");
                }
            }
            
            if (player1choice.equals("q")) {
                return;
            }
        }
    }
}
