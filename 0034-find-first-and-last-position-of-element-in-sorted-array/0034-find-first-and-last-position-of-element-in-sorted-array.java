class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
         arr[0] = binarySearch(nums,target,true);
         arr[1] = binarySearch(nums,target,false);
         return arr;
        
    }

    public int binarySearch(int[] nums, int target,boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}