/*
 Write a java program to demonstrate dynamic method dispatch and abstract
 keyword with class and methods.
 */
abstract class A {
    abstract void print_stuff();
}
class B extends A {
    void print_stuff() {
        System.out.println("Abstract class story here!");
    }
}
class C extends B {
    void print_stuff() {
        System.out.println("Class C story here!");
    }
}
 public class Program9 extends C {
    void print_stuff() {
        System.out.println("Main class story here!");
    }
    public static void main(String args[]) {
        B ref=new B();
        ref.print_stuff();
        ref = new C();
        ref.print_stuff();
        ref = new Program9();
        ref.print_stuff();;
    }
}
