class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i <= nums.length-k;i++){
            int min = nums[i];
            System.out.print(min);
            int max = nums[i+k-1];
            System.out.print(max);
            int diff = max-min;
            sum = Math.min(sum,diff);
            System.out.print(sum);
        }

        return sum;

    }
}