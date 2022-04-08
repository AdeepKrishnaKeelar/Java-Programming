//The Bubble-Sort in Java using command line arguments
/* Bubble Sort follows Brute Force Approach and has a time complexity of O(N) */
import java.lang.*; //the package for System.nanoTime()
class Bubble_Sort {
    public static void main(String[] args) {
        int nn=0,n,x,temp=0;
        long start = System.nanoTime(); //Calculating time taken to compile and execute
        n=Integer.parseInt(args[0]);
        nn+=1;
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++) {
            x = Integer.parseInt(args[nn]); //Command line argument based input
            nn+=1;
            arr[i]=x;
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<=(arr.length-1);j++) {
                if(arr[j-1]>arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is --");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        long end = System.nanoTime();
        long exec_time = end - start;
        double inSeconds = (double)exec_time / 1_000_000_000.0;
        System.out.println("The program took "+inSeconds+" seconds to execute.");
    }
}