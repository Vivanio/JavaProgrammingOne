
package Chapter3;
import java.util.Scanner;
/**
 *Comparing two numbers for which is greater
 * @author Donavon Mitchell
 */
public class P3 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type two numbers");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double d;
        if (d1 < d2)
        {
            System.out.println("The first number is less than the second");
        }
        if (d1 > d2)
        {
            System.out.println("The first number is greater than the second");
        }
        if ( d1 == d2)
        {
            System.out.println("The first number is equal to the second");
        }
        if (d1 <= d2)
        {
            System.out.println("The first number is less than or equal to the second");
        }
        if (d1 != d2)
        {
            System.out.println("The first number is not equal to the second");
        }
        if(d2 == 0)
        {
            System.out.println("Cannot divide by Zero");
        }
        else
        {
            d = d1 / d2;
            if (d < 1 )
            {
                System.out.println("Proper Fraction");
            }
            else
            {
                System.out.println("Improper Fraction");
            }
        }
        if (d1 >= 90)
        {
            System.out.println("A");
        }
        else
        {
            if (d1 >= 80)
            {
                System.out.println("B");
            }
            else
            {
                if (d1 >= 70)
                {
                    System.out.println("C");
                }
                else
                {
                    if (d1 >= 60)
                    {
                        System.out.println("D");
                    }
                    else
                    {
                        System.out.println("F");
                    }
                }
            }
        }
        if (d2 >= 1 && d2 <= 100)
        {
            System.out.println("In Range");
        }
        else
        {
            System.out.println("Out of Range");
        }
        
    }
}
