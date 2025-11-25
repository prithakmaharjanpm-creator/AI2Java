package Week_4;
import java.util.Scanner;

/**
 * Write a description of class EvenOddexample here.
 *
 * @author (Prithak Maharjan)
 * @version (a version number or a date)
 */
public class EvenOddexample
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        if(number%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        System.out.println("Ok job finished");
    }
}