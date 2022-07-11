/*3. Write a Java Programs to demonstrate the usage of the following:
a. Control structures of Java
b. Looping structures of Java*/
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
    int age;
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the age to be checked: ");
    age = scn.nextInt();
    if(age>=18) {
        System.out.println("You are eligible for DL");
    } else if(age>=16 && age<18) {
        System.out.println("You are ineligible for DL, but can ride Electric Scooter");
    } else {
        System.out.println("You are ineligible for DL!");
    }
    System.out.println("Enter something -- ");
    String s=scn.next();
    while(age>0) {
            System.out.println(s+" is "+ age+ " years old! Time travelling back!");
            age--;
        }
    }
}
