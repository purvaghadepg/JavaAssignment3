import java.util.Scanner;

//4.Count the number of occurrence of each element of an array.
public class Assignment4 {
    public static void main(String args[]){
        int n,x=0;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int freq[]=new int[n];

        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            freq[i]=-1;
        }
        for(int i=0;i<n;i++){
            count=0;
            for (int j=i+1;j<n;j++){
                 if(arr[i]==arr[j]){
                   count++;
                   freq[j]=0;
                }

            }
            if(freq[i]!=0)
            freq[i]=count;
            x++;
        }
        for(int i=0;i<n;i++){
          if(freq[i]!=0)
            System.out.println("The element is "+arr[i]+" ANd the total occurence is "+freq[i]);
          //  System.out.println(freq[i]);
        }

    }
}
