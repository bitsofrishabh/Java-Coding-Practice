package leetcode.easy;

// LeetCode problem to Find numbers with Even number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigit1295 {
    public static void main(String[] args) {
        int[] arr= {121,1204,31,4211,42392};
        System.out.println(findNumbers(arr));
    }

     static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        int numberofDigits= digit(num);
        return numberofDigits%2==0;
    }

    static int digit(int number){
        if(number<0){
            number=number*-1;
        }
        //To get the number in any digits
        return (int)(Math.log10(number)+1);
    }
}
