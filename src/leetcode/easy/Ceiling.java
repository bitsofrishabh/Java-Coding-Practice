package leetcode.easy;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    private static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        // return the index: greatest number <= target
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end= mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                return mid;
            }
            return start;
        }
        return start;
    }
}
