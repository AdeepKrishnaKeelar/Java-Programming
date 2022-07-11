/**************************************************************************************
1.Create a Java class called Student with the following details as variables within it.
i) USN
(ii) Name
(iii) Branch
(iv) Phone
create n Student objects and print the USN, Name, Branch, and Phone of these objects with
suitable headings.
****************************************************************************************/
import java.util.Scanner;
public class Student {
    String USN,Name,Branch,Phone;
    public Student() {
        USN=" ";
        Name=" ";
        Branch=" ";
        Phone=" ";
        System.out.println("All Good to Go!");
    }
    void setUSN(String USN) {
        this.USN = USN;
    }
    void setName(String Name) {
        this.Name = Name;
    }
    void setBranch(String Branch) {
        this.Branch = Branch;
    }
    void setPhone(String Phone) {
        this.Phone = Phone;
    }
    String getUSN() {
        return this.USN;
    }
    String getName() {
        return this.Name;
    }
    String getBranch() {
        return this.Branch;
    }
    String getPhone() {
        return this.Phone;
    }
    public static void main(String args[]) {
        int n;
        Scanner scn=new Scanner(System.in);
        System.out.println("How Many Students?");
        n = scn.nextInt();
        Student s[] = new Student[n];
        for(int i=0;i<n;i++) {
            s[i]=new Student();
            System.out.println("Enter the details of Student "+(i+1));
            System.out.println("Enter the USN of the student -- ");
            s[i].setUSN(scn.next());
            System.out.println("Enter the Name of the student -- ");
            s[i].setName(scn.next());
            System.out.println("Enter the Branch of the student -- ");
            s[i].setBranch(scn.next());
            System.out.println("Enter the Phone of the student -- ");
            s[i].setPhone(scn.next());
        }
        System.out.println("The Student Details are --- ");
        for(int i=0;i<n;i++) {
            System.out.println("Student "+(i+1)+" Details --- ");
            System.out.println("Student USN -- "+ s[i].getUSN());
            System.out.println("Student Name -- "+ s[i].getName());
            System.out.println("Student Branch -- "+ s[i].getBranch());
            System.out.println("Student Phone -- "+ s[i].getPhone());
        }
        scn.close();
    }
}
