package Chapter6;

import java.util.Scanner;
//import java.lang.Character;

/**
 *
 * Converting the prices of money
 *
 * @author Donavon Mithchell
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        //String finish;
        char yeet = ' ';
        double dollar, euro, pound, yen;
        System.out.println("How much is a Euro compared to a dollar");
        euro = input.nextDouble();
        System.out.println("How much is a Pound Sterling compared to a dollar");
        pound = input.nextDouble();
        System.out.println("How much is a Yen compared to dollar");
        yen = input.nextDouble();
        System.out.println("How many US dollars do you want to convert?");
        dollar = input.nextDouble();
        Banker(dollar, yen, euro, pound, yeet);
    }

    public static double Banker(double home, double anime, double queen, double sword, char stopper) {
        //System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen :");
        //Scanner input = new Scanner(System.in);
        String holder;
        double yo;
        boolean stop = false;
        while (stop != true) {
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen :");
            Scanner input = new Scanner(System.in);
            //String holder;
            if (home < 100.0) {
                yo = home;

                home = home * 0.9;

            } else {
                yo = home;
                home = home * 0.95;
            }

            holder = input.next();
            stopper = holder.charAt(0);
            if (stopper == 'E' || stopper == 'e') {
                queen = home * queen;
                System.out.printf("For %.2f dollars, you can buy %.2f Euros", yo, queen);
                queen = queen / home;
            } else {
                if (stopper == 'P' || stopper == 'p') {
                    sword = home * sword;
                    System.out.printf("For %.2f dollars, you can buy %.2f Pound Sterlings", yo, sword);
                    sword = sword / home;
                } else {
                    if (stopper == 'y' || stopper == 'Y') {
                        anime = home * anime;
                        System.out.printf("For %.2f dollars, you can buy %.2f Yen", yo, anime);
                        anime = anime / home;
                    }
                }
            }
            //stopper = holder.charAt(0);
            while (!holder.equals("no") && !holder.equals("No") && !holder.equals("yes") && !holder.equals("Yes")) {
                System.out.println();
                System.out.print("Do you want to continue? (answer Yes or No) :");
                holder = input.next();
                if (holder.equals("no") || holder.equals("No")) {
                    stop = true;
                }
                if (holder.equals("yes") || holder.equals("Yes")) {
                    System.out.println();
                    System.out.println("How many US dollars do you want to convert?");
                    home = input.nextDouble();
                }
                //System.out.println("2");
            }
        }
        return home;
    }
}
