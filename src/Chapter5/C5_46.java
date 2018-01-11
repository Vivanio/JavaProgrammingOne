package Chapter5;


import java.util.Scanner;

/**
 *
 * Reverses the string that is inputed
 *
 * @author Donavon Mitchell
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Please input the string you want to reverse \n");
        Scanner input = new Scanner(System.in);
        String forth = input.next();
        String back = "";
        for (int i = 0; i < forth.length(); i++) {
            back = forth.charAt(i) + back;
        }
        System.out.println(back + " is the reversed version of " + forth);
    }
}
