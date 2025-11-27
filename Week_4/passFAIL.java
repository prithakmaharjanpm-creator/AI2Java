package Week_4;
import java.util.Scanner;

/**
 * Write a description of class passFAIL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passFAIL
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        double marks=sc.nextDouble();
        if (marks>=60 && marks<=100)
        {
            System.out.println("Pass.");
            System.out.println("GOOD👍👍.");
        }
        else if (marks>100 || marks<0)
        {
            System.out.println("Invalid.");
        }
        else
        {
            System.out.println("Fail.");
            System.out.println("Stupid🤣🤣🤣🤣.");
        }    
    }
}