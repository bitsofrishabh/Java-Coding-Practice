package leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesSR {
    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 1,1,2 };
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int count = 1; //will start from 1st index as 0th is unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                //Insert the unique value at count index
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

}
