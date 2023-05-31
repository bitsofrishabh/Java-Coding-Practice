package leetcode.easy;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,12,61,63,99,100,121,422,567,678,753,789,799,800,810,820,999};
        int target = 100;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start =0;
        int end = 1;

        while(target>arr[end]) {
            int temp = end+1; // this is my new start
            end = end + 2*(end-start +1);
            start = temp;

        }
        return binarySearch(arr,target,start,end);
    }

    static  int binarySearch(int[]arr, int target,int start, int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else  if(target<arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
