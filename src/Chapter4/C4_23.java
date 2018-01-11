
package Chapter4;
import java.util.Scanner;
/**
 *Showing your holdings and also Net Pay
 * @author Donavon Mitchell
 */
public class C4_23 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:  \n");
        String name = input.next();
        System.out.println("Enter Hours Worked:  \n");
        double hour = input.nextDouble();
        System.out.println("Enter Hourly Pay Rate:  \n");
        double payRate = input.nextDouble();
        System.out.println("Enter Federal Tax Percentage:  \n");
        double feds = input.nextDouble();
        System.out.println("Enter State Tax Percentage:  \n");
        double state = input.nextDouble();
        double grossPay = payRate * hour;
        double fedHolding = grossPay * feds;
        double stateHolding = grossPay * state;
        double totalHolding = stateHolding + fedHolding;
        double netPay = grossPay - totalHolding; 
        System.out.println("Employee Name: "+ name);
        System.out.println("Hours Worked: "+ hour);
        System.out.println("Pay Rate: "+payRate);
        System.out.printf("Gross Pay: $%.2f", grossPay);
        System.out.println("Deductions:");
        System.out.printf("    Federal Witholding ("+(feds * 100) + "%): $%.2f", fedHolding);
        System.out.printf("    State Witholding ("+(state * 100) + "%): $%.2f", stateHolding);
        System.out.printf("    Total Deduction: $%.2f ", totalHolding);
        System.out.printf("Net Pay: $%.2f", netPay);
    }

}
