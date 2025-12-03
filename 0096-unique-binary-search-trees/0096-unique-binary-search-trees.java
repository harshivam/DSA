class Solution {
    public int numTrees(int n) {
        int[][] memo = new int[n+1][n+1];
        return helper(1,n,memo);
    }
    public int helper(int start , int end,int[][] memo){
        if(start>=end) return 1;
        if(memo[start][end]>1){
            return memo[start][end];
        }
        int ans = 0;

        for(int i = start; i<= end ; i++){
            int l = helper(start,i-1,memo); //left subtree
            int r = helper(i+1, end,memo); //right subtree
            ans += l*r;
        }
        return ans;
    }
}