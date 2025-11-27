package Week_4;
import java.util.Scanner;

/**
 * Write a description of class Calculator_Using_Switch here.
 *
 * @author (Prithak Maharjan)
 * @version (a version number or a date)
 */
public class Calculator_Using_Switch
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no:");
        int num1=sc.nextInt();
        System.out.println("Enter the second no:");
        int num2=sc.nextInt();
        System.out.println("Enter the operator as (+ - * /)");
        char operator=sc.next().charAt(0);
        
        switch(operator)
        {
            case '+': System.out.println("Addition is "+(num1+num2));
            break;
            case '-': System.out.println("Subtraction is "+(num1-num2));
            break;
            case '*': System.out.println("Product is "+(num1*num2));
            break;
            case '/': System.out.println("Division is "+(num1/num2));
            break;
            default : System.out.println("Invalid Input.");
            break;
        }
    }
}