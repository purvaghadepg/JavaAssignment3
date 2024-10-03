//1.    Find the Maximum Element and Average of Elements in an Array.

import java.util.Scanner;

public class Assignment1 {
    public static void main(String args[]){
        int n;
        int max=0;
        int avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            avg=avg+arr[i];
        }
        avg=avg/arr.length;
        System.out.println("Max Element is "+max);
        System.out.println("Average of array is "+avg);


    }
}
