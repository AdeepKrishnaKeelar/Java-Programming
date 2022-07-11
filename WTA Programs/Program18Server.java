/*
 1. Write a program that implements the client/server application. The client sends the
data to the server; the server receives the data, uses it to produce a result and then sends
the result back to the client. The client displays the result on the console
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
 public class Program18Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(3000);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        int num = din.readInt();
        int res= num*num;
        dout.writeInt(res);
        ss.close();
    }
}
