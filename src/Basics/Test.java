package Basics;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        //[1,3,6,10]
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];

        }
        System.out.print(Arrays.toString(nums));
    }
}
