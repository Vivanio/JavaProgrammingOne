package Chapter5;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * A game of rock, paper, scissors
 *
 * @author dm0971102
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameOn = false;
        String flag = "";
        System.out.println("Hi, welcome to Jajanken");
        System.out.println("Please type anything to begin");
        while (gameOn == false) {
            if (flag != "") {
                gameOn = true;
            } else {
                flag = input.next();
            }
        }
        int comScore = 0;
        int playerScore = 0;
        int hand, comHand;
        String comPlay = "", playerPlay = "";
        while (gameOn == true && !(playerScore > (comScore + 2) || comScore > (playerScore + 2))) {
            System.out.println("What is Your Play? Rock(1), Paper(2), or Scissors(3)? : ");
            hand = input.nextInt();
            if (hand == 1) {
                playerPlay = "Rock";
            }
            if (hand == 2) {
                playerPlay = "Paper";
            }
            if (hand == 3) {
                playerPlay = "Scissors";
            }
            System.out.println("You Played a " + playerPlay);
            comHand = (int) (Math.random() * 3);
            if (comHand == 1) {
                comPlay = "Rock";
            }
            if (comHand == 2) {
                comPlay = "Paper";
            }
            if (comHand == 3) {
                comPlay = "Scissors";
            }
            System.out.println("COM Played a " + comPlay);
            if (comHand == hand) {
                System.out.println("Both Played the Same");
            }
            if (comHand == 3 && hand == 1) {
                System.out.println("Player gains a point.");
                playerScore++;
            }
            if (comHand == 1 && hand == 3) {
                System.out.println("COM gains a point.");
                comScore++;
            }
            if (comHand == 2 && hand == 3) {
                System.out.println("Player gains a point.");
                playerScore++;
            }
            if (comHand == 3 && hand == 2) {
                System.out.println("COM gains a point.");
                comScore++;
            }
            if (hand == 1 && comHand == 2) {
                System.out.println("COM gains a point.");
                comScore++;
            }
            if (hand == 2 && comHand == 1) {
                System.out.println("Player gains a point.");
                playerScore++;
            }
            System.out.println("Player's Score : " + playerScore + ", COM Score : " + comScore);
            System.out.println("------------------------");
            System.out.println("");
        }
        if (playerScore > comScore) {
            System.out.println("Player Wins");
        } else {
            System.out.println("COM Wins");
        }

    }
}
