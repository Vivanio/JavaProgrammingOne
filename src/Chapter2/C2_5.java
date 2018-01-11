package Chapter2;

import java.util.Scanner;

/**
 * To show your gratuity rate and amount of total $$ you have
 *
 * @author Donavon Mitchell
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate:  ");
        double Subtotal = input.nextFloat();
        double Gratuity = Subtotal / input.nextFloat();
        double Total = Subtotal + Gratuity;
        System.out.println("The gratuity is " + Gratuity + " and the total is " + Total + ".");

    }
}
