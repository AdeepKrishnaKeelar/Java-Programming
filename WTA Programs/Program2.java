/*2.Write a Java programs to demonstrate working of polymorphism in Java:
a. Method Overloading
b. Constructor Overloading.
c. Break and Continue statements*/
public class Program2 {
    public Program2() {
        System.out.println("This constructor is overloaded!");
    }
    public Program2(String s) {
        System.out.println("This constructor is being overloaded by a dumbass called "+s);
    }
    void method_overload() {
        System.out.println("Love for overloading");
    }
    void method_overload(String s) {
        System.out.println(s+" loves overloading");
    }
    public static void main(String args[]) {
        Program2 p=new Program2();
        Program2 pp=new Program2("Adeep");
        p.method_overload();
        p.method_overload("Adeep");
        for(int i=0;i<10;i++) {
            pp.method_overload();
            pp.method_overload("CSE");
            if(i==3) {
                continue;
            } else if(i==4) {
                break;
            }
        }
    }
}