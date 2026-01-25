class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i <= nums.length-k;i++){
            sum = Math.min(sum,nums[i+k-1]-nums[i]);      
        }

        return sum;

    }
}