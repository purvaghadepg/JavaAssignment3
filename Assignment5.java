import java.util.Scanner;

//5.    Find the Fibonacci Series
public class Assignment5 {
    public static void main(String args[]) {
        int n,index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        int a=0,b=1,fibo=0;
        for(int i=0;i<n;i++){
            fibo=fibo+a;
            a=b;
            b=fibo;
            arr[index++]=fibo;
            //System.out.println(fibo);
        }
        System.out.println("Fibonacci with array");

        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
