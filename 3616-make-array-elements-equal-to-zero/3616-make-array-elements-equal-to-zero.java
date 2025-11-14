class Solution {
    public int countValidSelections(int[] nums) {
        int countZero = 0;
        for (int ele : nums) {
            if (ele != 0)
                countZero++;
        }
        int ways = 0;
        int[] prefix = new int[nums.length+1];

        for(int i = 1;i< prefix.length;i++){
            prefix[i] = prefix[i-1]+ nums[i-1];
        }
        //1,0,2,0,3
        //0,1,2,3,4
        //0,1,1,3,3,6

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
              int sumLeft = prefix[i];
              System.out.println(sumLeft);
              int sumRight = prefix[prefix.length-1] - sumLeft;
              System.out.println(sumRight);
              if(sumLeft==sumRight){
                ways+=2;
              }
              else if(Math.abs(sumRight-sumLeft)==1){
                ways++;
              }
            }
        }
        return ways;

    }

}