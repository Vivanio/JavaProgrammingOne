
package Chapter3;
import java.util.Scanner;
/**
 *If a number is divisible by 5 or 6
 * @author Donavon Mitchell
 */
public class C3_26 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input an integer: ");
        int user = input.nextInt();
        int bySix = user % 6;     
        int byFive = user % 5;
        boolean choose = false;
        if (bySix == 0 && byFive == 0)
        {
            choose = true;
        }else{
            choose = false;
        }
        System.out.println("Is 10 divisible by 5 and 6? " + choose);
        if (bySix == 0 ^ byFive == 0)
        {
            choose = true;
        }else{
            choose = false;
        }
        System.out.println("Is 10 divisible by 5 or 6? " + choose);
        if (bySix == 0 || byFive == 0)
        {
            choose = true;
        }else{
            choose = false;
        }
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + choose);
    }

}
