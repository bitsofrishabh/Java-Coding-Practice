package leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// The Optimal solution is with Hash-table come back again to optimize this solution
public class NumberSmaller {
    public static void main(String[] args) {
        int[] ans = { 7, 7, 7, 7 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(ans)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
