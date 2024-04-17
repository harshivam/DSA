package binarySearch;

public class Binary {
    //PS 38 , Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    static int BinarySearchCeiling(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if(target>nums[end]){
            return nums.length;
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if (target>nums[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start;
    }

    static int BinarySearchFloor(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if(target>nums[end]){
            return nums.length;
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if (target>nums[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return end;
    }


}
