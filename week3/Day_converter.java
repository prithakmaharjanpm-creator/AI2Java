package week3;


/**
 * Write a description of class Day_converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Day_converter
{
  public static void main(String[]arg)
  {
    System.out.println("enter Days:");
    Scanner input=new Scanner(System.in);
    int Days=input.nextInt();
    int Years=Days/365;
    int Months=(Days%365)/30;
    int days=(Days%365)%30;
    System.out.println("Years:" +Years);
    System.out.println("month:" +Months);
    System.out.println("days:" +days);
  } 
}
