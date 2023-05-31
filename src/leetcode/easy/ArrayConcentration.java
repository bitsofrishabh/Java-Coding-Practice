package leetcode.easy;
//https://leetcode.com/problems/concatenation-of-array/
public class ArrayConcentration {
    public static void main(String[] args) {

        int[] nums = {1,2,1};
        // getConcatenation(nums);
System.out.println(getConcatenation(nums));


    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
