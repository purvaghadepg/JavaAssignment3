import java.util.Scanner;

//8.    Java program to count numbers of even and odd elements in an array
public class Assignment8 {
    public static void main(String args[]){
        int n;
        int even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Evens are "+even);
        System.out.println("Odds are "+odd);
    }
}
