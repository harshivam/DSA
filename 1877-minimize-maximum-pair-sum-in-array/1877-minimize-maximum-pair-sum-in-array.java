class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

    
        int j = nums.length-1;
        int max = 0;
        for(int i = 0; i < nums.length/2; i++){
            int pairSum = nums[i] + nums[j];
            max = Math.max(max,pairSum);
            j--;
        }

    return max;
    }
}