package Chapter3;

import java.util.Scanner;

/**
 * Comparing prices of package to see which is better.
 *
 * @author Donavon Mitchell
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2:  ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();
        double equality1 = price1 / weight1;
        double equality2 = price2 / weight2;
        if (equality2 < equality1) {
            System.out.println("Package 2 has the better package");
        }
        if (equality1 < equality2) {
            System.out.println("Package 1 has the better package");
        }
        if (equality2 == equality1) {
            System.out.println("Package 1 is equal to package 2");
        }
    }

}
