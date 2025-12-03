class Solution {
    public int numTrees(int n) {
        return helper(1,n);
    }
    public int helper(int start , int end){
        if(start>=end) return 1;
        int ans = 0;

        for(int i = start; i<= end ; i++){
            int l = helper(start,i-1);
            int r = helper(i+1, end);
            ans += l*r;
        }
        return ans;
    }
}