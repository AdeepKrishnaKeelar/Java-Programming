/*
 1. Write a program that implements the client/server application. The client sends the
data to the server; the server receives the data, uses it to produce a result and then sends
the result back to the client. The client displays the result on the console
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Program18Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",3000);
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter some number -- ");
        int n=scn.nextInt();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeInt(n);
        int res=din.readInt();
        System.out.println("Result from Server -- "+ res);
        s.close();
    }
}
