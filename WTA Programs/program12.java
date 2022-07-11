/*12. a. write a program to demonstrate user define exception.
b. Write program in java to demonstrate the use of throw and throws in exception */
class myException extends Exception{
    private int detail;
    myException(int a) {
        detail=a;
    }
    public String toString() {
        return "My Exception["+detail+"]";
    }
}
public class program12 {
    static void compute(int a) throws myException {
        System.out.println("Called compute("+a+")");
        if(a>10) {
                throw new myException(a);
        } else {
        System.out.println("Normal Exit!");
        }
    }
    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch(myException e) {
            System.out.println("Caught "+e);
        }
    }
}