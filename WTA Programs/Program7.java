/*
 7. Write a Java program to facilitate multilevel inheritance. (Also demonstrate the use
    of constructor in multilevel inheritance)
 */
class Class1 {
    int A;
    public Class1() {
        A=10;
        System.out.println("Class 1 Value is "+ A);
    }
}
class Class2 extends Class1 {
        int B;
        public Class2() {
            B=20;
            System.out.println("Class 2 Value is "+B);
        }
}
class Class3 extends Class2 {
        int C;
        public Class3() {
            C=30;
            System.out.println("Class 3 Value is "+C);
        }
}
public class Program7 {
    public static void main(String args[]) {
        Class3 c3 = new Class3();
        System.out.println("All the values equal to -- "+ (c3.A+c3.B+c3.C));
    }
}
