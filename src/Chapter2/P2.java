package Chapter2;

import java.util.Scanner;

/**
 * Shows fast food receipt including taxes
 *
 * @author Donavon Mitchell
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mealPrice;
        float drinkPrice;
        float dessertPrice;
        float totalPrice;

        System.out.println("Hi, Welcome to KFC! Please tell me what price your meal is");
        System.out.print("Entree:  ");
        mealPrice = input.nextFloat();
        System.out.print("Beverage:  ");
        drinkPrice = input.nextFloat();
        System.out.print("Dessert:  ");
        dessertPrice = input.nextFloat();
        totalPrice = mealPrice + drinkPrice + dessertPrice;

        float food = totalPrice;
        float finalTax = totalPrice * .10F;
        totalPrice = totalPrice + (finalTax);
        float finalTip = totalPrice * .15F;
        totalPrice = finalTip + totalPrice;
        System.out.println("Your order will be $" + totalPrice + ". Thank you and have a nice day!");
        System.out.println("Receipt:   Meal is " + totalPrice + ", The Tax is " + finalTax + ", The Tip is " + finalTip + ", and your original meal price is " + food);

    }
}
