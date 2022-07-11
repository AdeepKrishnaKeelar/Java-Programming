/*
 8. Write a Java Program to demonstrate the concept of hierarchical inheritance.
    (implement this program with super keyword, final keyword, constructor and method
    overriding concept)
 */
class A {
    final String str = "NIE";
    String name;

    A() {
        this.name="Adeep";
    }
    A(String name) {
        this.name=name;
    }
    void printData() {
        System.out.println(name+" is from this college "+ str);
    }
}
class B extends A {
    String s;
    B(String s) {
        super();
        this.s=s;
    }
    void printData() {
        super.printData();
        System.out.println(this.s+" is from this college "+ super.str);
    }
}

 public class Program8 extends A{
    public static void main(String[] args) {
        Program8 p8 = new Program8();
        p8.printData();
        B obj = new B("Abhilash");
        obj.printData();
    }
}
