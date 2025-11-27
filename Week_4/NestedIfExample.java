package Week_4;
import java.util.Scanner;

/**
 * Write a description of class NestedIfExample here.
 *
 * @author (Prithak Maharjan)
 * @version (a version number or a date)
 */
public class NestedIfExample
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num1=sc.nextInt();

        if(num1%3==0)
        {
            if(num1%5==0)
            {
                System.out.println("Divisible by both 3 and 5.");
            }
            else
            {
                System.out.println("Divisible by 3 only.");
            }
        }
        else
        {
            if(num1%5==0)
            {
                System.out.println("Divisible by 5 only.");
            }
            else
            {
                System.out.println("Not divisible by both");
            }
        }
    }
}