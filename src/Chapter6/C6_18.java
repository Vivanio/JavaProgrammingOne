package Chapter6;

import java.util.Scanner;
import java.lang.Character;

/**
 *
 * Checking password to see if it aligns with policy
 *
 * @author Donavon Mitchell
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //boolean valid = false;
        int counter = 0;
        System.out.print("Please input your password to check : \n");
        String user = input.next();
        System.out.println();
        counter = checker(user, counter);
        //System.out.println(counter);
        if (counter == 1) {
            System.out.println("The password must have atleast 8 characters");
            System.out.println("Invalid Password");
        }
        if (counter == 2) {
            System.out.println("The password should only have letters and numbers");
            System.out.println("Invalid Password");
        }
        if (counter == 3) {
            System.out.println("The password must have atleast two digits");
            System.out.println("Invalid Password");
        }
        if (counter == 0) {
            System.out.println("This password is valid");
            System.out.println("-------------------");
            System.out.println(user);
            System.out.println("-------------------");
        }
    }

    //Return type cannot be void
    public static int checker(String office, int um) {
        int count = 0;
        boolean no = false;
        um = 0;
        if (office.length() >= 8) {
            no = true;
        } else //System.out.println("The password must have atleast 8 characters");
        {
            um = 1;
        }
        if (no == true) {
            for (int i = 0; i < office.length(); i++) {
                if (Character.isLetterOrDigit(office.charAt(i)) == true && no == true) {
                    no = true;
                } else {
                    //System.out.println("The password should only have letters and numbers");
                    no = false;
                    um = 2;
                    break;
                }
            }
        }
        for (int i = 0; i < office.length(); i++) {
            if (Character.isDigit(office.charAt(i))) {
                count += 1;
            }
            if (count < 2 && i == (office.length() - 1)) {
                no = false;
                um = 3;
                //System.out.println("The password must have atleast two digits");
            }

        }
        int lol = um;
        //String leedle = office;
        return lol;
    }
}
