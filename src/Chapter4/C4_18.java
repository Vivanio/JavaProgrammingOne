
package Chapter4;
import java.util.Scanner;
/**
 *Student Validation
 * @author Donavon Mitchell
 */
public class C4_18 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Student Class ID.(EX: M4, I2) : \n");
        String user;
        user = input.next();
        char userClass, userYear;
        userClass = user.charAt(0);
        userYear = user.charAt(1);
        if ((userClass == 'M' || userClass == 'C' || userClass == 'I') && (userYear == '1' || userYear == '2' || userYear == '3' || userYear == '4'))
        {
            
            System.out.print((userClass == 'M')? "Mathematics " : "");
            System.out.print((userClass == 'C')? "Computer Science " : "");
            System.out.print((userClass == 'I')? "Information Technology " : "");
            System.out.print((userYear == '1')? "Freshman   " : "");
            System.out.print((userYear == '2')? "Sophomore  " : "");
            System.out.print((userYear == '3')? "Junior " : "");
            System.out.print((userYear == '4')? "Senior " : "");
        }
        else
        {
            System.out.println("Your ID is invalid");
        }
    }

}
