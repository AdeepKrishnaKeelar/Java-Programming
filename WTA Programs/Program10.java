/*
 10.Try to implement the concept of multiple inheritance in Java with the use of
    interface.
 */
import java.util.Scanner;
interface Addition {
    public int addition(int x,int y);
}
interface Subtraction {
    public int subtraction(int x,int y);
}
public class Program10 implements Addition, Subtraction {
    public int addition(int x,int y) {
        return x+y;
    }
    public int subtraction(int x,int y) {
        return x-y;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers -- ");
        x=scn.nextInt();
        y=scn.nextInt();
        Program10 p10 = new Program10();
        System.out.println("The results are -- 1.Addition "+ p10.addition(x, y));
        System.out.println("The results are -- 2.Subtraction "+ p10.subtraction(x, y));
    }
}
