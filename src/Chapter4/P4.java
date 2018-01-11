
package Chapter4;
import java.util.Scanner;
/**
 *Displays which Bidder will win by comparing information]
 * @author Donavon Mitchell
 */
public class P4 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is Bidder 1's Name?:  ");
        String name1 = input.next();
        System.out.println("How long do they work?:  ");
        int hour1 = input.nextInt();
        System.out.println("How much are they paid?:  ");
        double charge1 = input.nextDouble();
        System.out.println("What is Bidder 1's Name?:  ");
        String name2 = input.next();
        System.out.println("How long do they work?:  ");
        int hour2 = input.nextInt();
        System.out.println("How much are they paid?:  ");
        double charge2 = input.nextDouble();
        double cost1 = hour1 * charge1;
        double cost2 = hour2  * charge2;
        if (cost1 < cost2)
        {
           System.out.printf("The Winner is "+name1+" with %.2f",cost1);
        }
        if (cost2 < cost1)
        {
           System.out.printf("The Winner is "+name2+" with %.2f",cost2);
        }
        if (cost1 == cost2 && hour1 < hour2)
        {
            System.out.printf("The Winner is "+name1+" with %.2f",cost1);
        }
        if (cost1 == cost2 && hour2 < hour1)
        {
            System.out.printf("The Winner is "+name2+" with %.2f",cost2);
        }
        if (cost1 == cost2 && hour1 == hour2)
        {
            System.out.println(name1 +" and " + name2 + " Both have the same bid.");
            System.out.println("Hours : "+ hour1);
            System.out.printf("Rate : %.2f\n", charge1);
            System.out.printf("Cost : %.2f", cost1);
        }
        
    }
}
