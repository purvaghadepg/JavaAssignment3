import java.util.Scanner;

//9. Java program for rotation of elements of array- left and right. An array is said to be right
//   rotated if all the selected elements were moved towards right by one position
public class Assignment9 {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to rotate");
        n = sc.nextInt();
        int r = 0;
        int temp = 0;
      for(int j=0;j<n;j++){
            temp = arr[arr.length - 1];
            for (int i = arr.length-1; i >0; i--) {
                arr[i] = arr[i - 1];

            }
            arr[0] = temp;

        }
        System.out.println("Rotated left - right ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    }

