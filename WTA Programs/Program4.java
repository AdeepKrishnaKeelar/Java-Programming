/*********************************************************************************************
4. Write a Java programs to demonstrate the usage of the For-Each Style for- loop- statement
**********************************************************************************************/
public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0,sum2=0;
        for(int i:arr) {
            sum+=i;
        }
        System.out.println("Sum of the Array is -- "+ sum);
        for(int i=0;i<arr.length;i++) {
            sum2+=arr[i];
        }
        System.out.println("Sum of the same array using for is "+sum2);
    }
}
