
package Chapter2;

import java.util.Scanner;

/**
 * To Find the Area and Volume of a Cylinder
 * @author Donavon Mitchell
 */
public class C2_2 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a radius and length for a Cylinder in that order:   ");
        double Radius = input.nextDouble();
        double Length = input.nextDouble();
        double Area = 2 * Radius * 3.14;
        double Volume = Area * Length;
        System.out.println("The Area is " + Area + " and the Volume is " + Volume + ".");

    }
}
