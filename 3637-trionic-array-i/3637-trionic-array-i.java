class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        int n = nums.length; 

        //find increasing 
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        //decreasing
        while(i<n-1 && nums[i]>nums[i+1]){
            i++;
        }
        if(i==n-1){
            return false;
        }
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(i==n-1){
            return true;
        }

        return false;
        
    }
}