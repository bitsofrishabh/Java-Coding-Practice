package leetcode.medium;

public class RBS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //1,3 //
        System.out.println("ans " + search(arr,5));
    }

    public static int search(int[] nums, int target) {
            int pivot = findPivot(nums);
            System.out.println("pivot is" + pivot);
            //if you did not find a pivot, it means the array is not rotated
        if(pivot==-1){
            //just do the Normal Binary search
            binarySearch(nums,target,0,nums.length-1);
        } else
        if(pivot !=-1 && nums.length>1 && nums[pivot]==target){
            return pivot;
        } else
        if(target>=nums[0]){
          return  binarySearch(nums,target,0,pivot-1);
        }
        return  binarySearch(nums,target,pivot+1,nums.length-1);
    }

    public static int binarySearch(int[] arr, int target,int start,int end) {
        System.out.println(start + "," + end);
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if(target<arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases ahead for finding pivot
            if(arr.length==1){
                return arr[0];
            }
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start > mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end=mid-1;
//                return end;
            } else {
                start = mid+1;
//                return start;
            }
        }
        return -1;
    }
}
