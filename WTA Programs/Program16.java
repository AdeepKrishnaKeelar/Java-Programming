/*16. Write a Java program that reads on file name from the user, then displays
information about whether the file exists, whether the file is readable, whether the file
is writable, Absolute path of file and the length of the file in bytes */
import java.io.*;
class Program16 {
    public static void main(String[] args) {
        File f=new File("Adeep.txt");
        if(f.exists()) {
            System.out.println("File Name - "+f.getName());
            System.out.println("File Readable?"+f.canRead());
            System.out.println("File Writable?"+f.canWrite());
            System.out.println("Absolute Path -- "+f.getAbsolutePath());
            System.out.println("File Length --"+f.length());
        }   
    }    
}
