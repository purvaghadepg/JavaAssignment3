//3.Find the second maximum and second minimum Elements of an array.

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Maximum "+arr[arr.length-2]);
        System.out.println("Second Minimum "+arr[1]);

    }
}
