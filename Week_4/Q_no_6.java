package Week_4;
import java.util.Scanner;
/**
 * Write a description of class Q_no_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_no_6
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Category(A,B,C,D):");
        char cat=sc.next().charAt(0);
        if (cat!='A' && cat!='B' && cat!='C' && cat!='D')
        {
            System.out.println("Invalid Entry.");
        }
        else {
            System.out.println("Enter the Marked Price:");
            float mp=sc.nextFloat();
            switch (cat)
            {
                case 'A':
                    {
                        int d=60;
                        float sp;
                        sp=(mp-(mp*d/100));
                        System.out.println("Your selling price is:"+sp);
                    }
                    break;
                case 'B':
                    {
                        int d=40;
                        float sp;
                        sp=(mp-(mp*d/100));
                        System.out.println("Your selling price is:"+sp);
                    }
                    break;
                case 'C':
                    {
                        int d=20;
                        float sp;
                        sp=(mp-(mp*d/100));
                        System.out.println("Your selling price is:"+sp);
                    }
                    break;
                case 'D':
                    {
                        int d=10;
                        float sp;
                        sp=(mp-(mp*d/100));
                        System.out.println("Your selling price is:"+sp);
                    }
                    break;
                default :
                    {
                        System.out.println("Invalid entry.");
                    }
                    break;
            }
        }
    }
}