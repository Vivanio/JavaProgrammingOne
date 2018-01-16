package Chapter4;

import java.util.Scanner;

/**
 * Checking if one string is a substring of another
 *
 * @author Donavon Mitchell
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String body;
        String soul;
        int keeper;
        System.out.print("Please enter your first string : \n");
        body = input.next();
        System.out.println("Please enter your second string : \n");
        soul = input.next();
        keeper = body.length();
        if (body.contains(soul)) {
            System.out.println(soul + " is a substring of " + body);
        } else {
            System.out.println(soul + " is not a substring of " + body);
        }

    }

}
