package leetcode.easy;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                      {3,2,3}};
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
//        int[] row= arr[0];
        int sum=0;
        int max=sum;
        for(int person=0;person<accounts.length;person++){
             sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum= sum + accounts[person][account];
            }
        }
        if(max>sum){
            return max;
        }
        return sum;
    }
}
