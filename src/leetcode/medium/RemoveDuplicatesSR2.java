package leetcode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class RemoveDuplicatesSR2 {
    public static void main(String[] args) {

        // int[] nums = { 1, 1, 1, 2, 2, 3 }; // 5
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 }; // 7
        System.out.println(removeDuplicates(nums));
        System.out.println(1>1);
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        System.out.println(Arrays.toString(nums));
        return i;
    }

}

/*
 * We initialize an integer variable i to 0. This variable will keep track of
 * the length of the new array after removing duplicates.
 * We loop through each element n in the input array nums.
 * If i is less than 2 or n is greater than the element two positions before i
 * in nums, then we set nums[i] to n and increment i by 1. This ensures that
 * each unique element appears at most twice in the new array.
 * Finally, we return i, which represents the length of the new array.
 */