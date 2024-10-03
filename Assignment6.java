//6.    Program to check Harshad number or not using Java
//        Hint: - Harshad number is a number or an integer in base 10 which is completely
//        divisible by sum of its digits.
//        Example: Suppose a number 24. Calculate the sum of digits of the number
//        (2 + 4) = 6 .Check whether the number entered by user is completely divisible by
//        sum of its digits or not.

import java.util.Scanner;

public class Assignment6 {
    public static void main(String args[]){
        System.out.println("Enter a number ");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int rem = 0;
        int m=n;
        while(n>0){
           rem += n%10;
            n=n/10;
        }
        if(m%rem==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad number");

        }

    }
}
