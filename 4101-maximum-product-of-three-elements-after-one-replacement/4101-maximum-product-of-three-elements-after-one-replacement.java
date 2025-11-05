class Solution {
    public long maxProduct(int[] nums) {
        long firstMax = Integer.MIN_VALUE;
        int firstIDX = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(Math.abs(nums[i])>firstMax){
                firstMax = Math.abs(nums[i]);
                firstIDX = i;
            }
        }
        nums[firstIDX] = 0;

        long SecondMax = Integer.MIN_VALUE;
        int SecondIDX = 0;
        for(int i = 0;i<n;i++){
            if(Math.abs(nums[i])>SecondMax){
                SecondMax = Math.abs(nums[i]);
                SecondIDX = i;
            }
        }
        long firstProduct = firstMax*SecondMax;
        long secondProduct = (long)Math.pow(10,5);
    return secondProduct*firstProduct;
    }
}