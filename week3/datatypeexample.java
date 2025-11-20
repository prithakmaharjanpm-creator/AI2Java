package week3;

/**
 * Write a description of class datatypeexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class datatypeexample
{
    public static void main(String[]arg)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Float.BYTES+"\n"+Float.SIZE);
        byte r=12;
        byte d=13;
        int e=r+d;
        System.out.println(e);
        int a=20;
        float g=2.33f;
        double h=2.334;
        int x=(int)(a+g+h);
        System.out.println(x);
        int PP='A';
        int l=10;
        int b=20;
        int area=l*b;
        int per=2*(l+b);      
        System.out.println(area +"\n"+ per);
        System.out.println(PP);
        
        int princ=500;
        int time=2;
        float rate =2.4f;
        float SI=(princ*time*rate)/100;
        System.out.println(SI);
    }
}