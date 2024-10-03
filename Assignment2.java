//2.    Reverse a given Array and print.

import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[arr.length];
        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[index++]=arr[i];
        }
        System.out.println("Reverse array ");

        for(int i=0;i<index;i++){
            System.out.print(arr2[i]);
        }
    }
}
