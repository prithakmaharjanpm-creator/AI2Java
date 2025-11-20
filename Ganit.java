
/**
 * Write a description of class Ganit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ganit
{
    public static void main(String[]arg)
    {        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First No: ");
        int n1 = input.nextInt();
        System.out.println("Enter second no: ");
        int n2 = input.nextInt();
        int add=n1+n2;
        System.out.println("sum is: "+add);
        int sub=n1-n2;
        System.out.println("Diff is: "+sub);
        int mult=n1*n2;
        System.out.println("Multiply is: "+mult);
        double div=n1/n2;
        System.out.println("division is: "+div);
        double rem=n1+n2;
        System.out.println("Remainder is: "+rem);
        input.close();
    }
}