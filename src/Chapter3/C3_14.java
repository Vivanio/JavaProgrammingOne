package Chapter3;

import java.util.Scanner;

/**
 * Flipping a Coin
 *
 * @author Donavon Mitchell
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int leedle;
        int lee;
        leedle = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess heads or tails(heads = 1|tails = 0).");
        lee = input.nextInt();
        if ((leedle == 1) && (lee == 1)) {
            System.out.println("The Coin was Heads, You Win");
        }
        if ((leedle == 1) && (lee == 0)) {
            System.out.println("The Coin was Heads, You Lose");
        }
        if ((leedle == 0) && (lee == 1)) {
            System.out.println("The Coin was Tails, You Lose");
        }
        if ((leedle == 0) && (lee == 0)) {
            System.out.println("The Coin was Tails, You Win");
        }
    }

}
