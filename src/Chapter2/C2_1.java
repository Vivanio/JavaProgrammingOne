package Chapter2;

import java.util.Scanner;

/**
 * To convert from Celsius to Fahrenheit.
 *
 * @author Donavon Mitchell
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a degrees in Celsius(number only):  ");
        double Celsius;
        Celsius = input.nextDouble();
        double Fahrenheit;
        Fahrenheit = ((1.8F) * Celsius + 32);
        System.out.println("The Fahrenheit is " + Fahrenheit + " and the Celsius is " + Celsius + ".");
    }
}
