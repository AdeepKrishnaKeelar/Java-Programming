/*
 Write a different java program for generating following types of exception
a. NullPointerException
b. ArrayIndexOutOfBoundException
c. ArithmeticException
d. NumberFormatException
e. StringIndexOutOfBoundException
 */
import java.util.Scanner;
 public class Program11 {
    void NPE() {
        try {
            String s=null;
            System.out.println(s.length());
        } catch(NullPointerException err) {
            System.out.println("Null Pointer Exception!");
        }
    }
    void AIOOBE() {
        int[] arr= new int[10]; 
        try {
            arr[20]=8;
        } catch(ArrayIndexOutOfBoundsException err) {
            System.out.println("Array Index Out Of Bounds Error!");
        }
    }
    void AE() {
        try {
            int x=20/0;
            System.out.println(x);
        } catch(ArithmeticException err) {
            System.out.println("Arithmetic error!");
        }
    }
    void NFE() {
        String x="1234567adbsj";
        try {
            System.out.println(x);
        } catch(NumberFormatException err) {
            System.out.println("Number Format Error!");
        }
    }
    void SIOOBE() {
        String s="ADEEP";
        try {
            System.out.println(s.charAt(8));
        } catch(StringIndexOutOfBoundsException err) {
            System.out.println("String Index Out of Bounds!");
        }
    }
    public static void main(String[] args) {
        int ch;
        Scanner scn=new Scanner(System.in);
        Program11 p11 = new Program11();
        ch=scn.nextInt();
        switch(ch) {
            case 1: p11.NPE(); break;
            case 2: p11.AIOOBE(); break;
            case 3: p11.AE(); break;
            case 4: p11.NFE(); break;
            case 5: p11.SIOOBE(); break;
            default: System.out.println("Error!"); break;
        }
    }
}