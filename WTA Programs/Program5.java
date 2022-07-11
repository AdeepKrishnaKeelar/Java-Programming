/*********************************************************************************************
 5. Write a program in java to generate m x n multiplication table where in m and n values are
obtained as command line arguments.
 **********************************************************************************************/
public class Program5 {
    public static void main(String[] args) {
        int m=Integer.parseInt(args[0]);
        int n=Integer.parseInt(args[1]);
        for(int i=1;i<=n;i++) {
            System.out.println(m+" * "+i+" = "+(m*i)+" ");
        }
    }
}
