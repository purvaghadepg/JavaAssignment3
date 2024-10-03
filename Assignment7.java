//7.    Java Program for Sorting first half in Ascending order and second half in Descending order
//        Example
//        Input: arr [6] = [1, 90, 34, 89, 7, 9]
//        Output: 1 7 9 90 89 34

public class Assignment7 {
    public static void main(String args[]){
        int arr[]={1, 90, 34, 89, 7, 9};
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for(int i=0;i<arr.length;i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (j < arr.length / 2) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    } else {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                    }
                }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
