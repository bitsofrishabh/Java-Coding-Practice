package Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int temp1 = num;
//        int temp2 = num;
//        int sum=0;
//        int digits=0;
//        //To find the length of the number
//        while(temp2>0)
//        {
//            temp2 = temp2/10;
//            digits++;
//        }
//        //to find the power and adding the digits
//        while(num>0) {
//            int rem;
//            rem = num % 10;
//            sum = sum + (int) Math.pow(rem, digits);
//            num = num / 10;
//        }
//        if(sum == temp1){
//            System.out.println("it is Armstrong number");
//        } else {
//            System.out.println("Not AN");
//        }

        for (int i = 100; i < 999 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }

    }

    static boolean isArmstrong(int n){
       int original =n;
       int sum = 0;
       while(n>0){
           int rem = n%10;
           n= n/10;
           sum = sum + rem*rem*rem;
        }
       return original==sum;
    }
}
