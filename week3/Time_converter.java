package week3;


/**
 * Write a description of class Time_converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Time_converter
{
  public static void main(String[]arg)
  {
    System.out.println("enter Seconds:");
    Scanner input=new Scanner(System.in);
    int Seconds=input.nextInt();
    int hours=Seconds/3600;
    int minutes=(Seconds%3600)/60;
    int seconds=(Seconds%60);
    System.out.println("hours:" +hours);
    System.out.println("minutes:" +minutes);
    System.out.println("seconds:" +seconds);
  } 
}