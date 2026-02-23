class Solution {
    public int scoreDifference(int[] nums) {

        boolean firstActive = true;
        int first = 0, second = 0;

        for(int i = 0; i < nums.length; i++){    
            if(nums[i] % 2 != 0){
                firstActive = !firstActive;
            }
            if(i % 6 == 5){
                firstActive = !firstActive;
            }
            if(firstActive) first += nums[i];
            else second += nums[i];
        }

        return first - second;
    }
}