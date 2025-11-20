
/**
 * Write a description of class WEEK_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WEEK_2
{
    public static void main(String[]arg)
    {
        System.out.println("My name is:");
        System.out.println("Prithak Maharjan.");
        String BOOM="Prithak.";
        System.out.println("My name is "+BOOM);
        
        int a=10;
        int b=10;
        System.out.println(++a);
        System.out.println(a++);
        int studentage=18;
        float GPA=3.6f;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String n = sc.nextLine();
        System.out.println("Name: "+n);
        System.out.println("Age: "+studentage);
        System.out.println("GPA: "+GPA);
    }
}
  