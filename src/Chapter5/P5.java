package Chapter5;

import java.util.Scanner;

/**
 * Counts the total votes including which said yes and no
 *
 * @author Donavon Mitchell
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char vote = ' ';
        boolean Voting = true;
        int no = 0, yes = 0, invalid = 0, total = 0;
        System.out.println("Please enter your vote, each valid one will be accounted for.");
        while (Voting == true) {
            vote = input.next().charAt(0);
            /*if ((vote != 'n' || vote != 'N' || vote != 'y' || vote != 'Y' || vote != 'q' || vote != 'Q'))
            {
                System.out.println("INVALID CODE");
            }*/
            if (vote == 'y' || vote == 'Y') {
                yes++;
            } else {
                if (vote == 'n' || vote == 'N') {
                    no++;
                } else {
                    if (!(vote != 'q' || vote != 'Q')) {
                        System.out.println("INVALID CODE");
                    }
                    invalid++;
                }
            }
            if (vote == 'q' || vote == 'Q') {
                Voting = false;
                total = --invalid + no + yes;
            }
        }
        System.out.println("Yes votes : " + yes);
        System.out.println("No votes : " + no);
        System.out.println("Invalid votes : " + invalid);
        System.out.println("Total votes : " + total);

    }
}
