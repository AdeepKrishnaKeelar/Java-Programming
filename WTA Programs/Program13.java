/*
 13. Write a program to create a new thread by extending a thread class.

a. Get the current thread name
b. Set the highest priority to the newly created thread
c. Pause a thread for 2.5 seconds.
d. Check whether the thread is in running state or not.
e. Verify your newly created thread must be completed first before
your main thread is completed.
 */
class myThread extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" is running!");
            sleep(2500);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
 public class Program13 extends Thread {
    public static void main(String args[]) {
        System.out.println("Currently running"+Thread.currentThread().getName());
        myThread t1=new myThread();
        System.out.println("Is t1 alive?"+t1.isAlive());
        t1.setPriority(10);
        t1.start();
        try {
            System.out.println("t1 Priority - "+t1.getPriority());
            System.out.println("t1 Alive? "+t1.isAlive());
            t1.join();
        } catch(Exception e) {
            System.out.println("Error!");
        }
        System.out.println("T1 alive? "+t1.isAlive());
        System.out.println("Main alive?"+Thread.currentThread().isAlive());
    }

}
