import java.lang.Runnable;
class Program152 implements Runnable {
    public void run() {
        System.out.println("Thread Name - "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Program152 p1=new Program152();
        Program152 p2=new Program152();
        Program152 p3=new Program152();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        t1.start();
        t2.start();
        t3.start();
    }
}

