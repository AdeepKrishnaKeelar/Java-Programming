/*
15. Write a program for creating three threads randomly using following methods:
a. By extending Thread class
b. By implementing Runnable interface
 */
public class Program15 extends Thread {
    public void run() {
        System.out.println("Running is "+Thread.currentThread().getName());
    }
    public static void main(String args[]) {
        Program15 t1=new Program15();
        Program15 t2=new Program15();
        Program15 t3=new Program15();
        t1.start();
        t2.start();
        t3.start();
    }
}
