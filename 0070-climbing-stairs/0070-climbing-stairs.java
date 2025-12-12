class Solution {
    public int climbStairs(int n) {
        int[] qb = new int[n+1];
        return help(n,qb);
    }
    public int help(int n,int[] qb){
        if(n<0) return 0;
        if(n==0) return 1;
        if(qb[n]!=0){
            return qb[n];
        }
        int way1 = help(n-1,qb);
        int way2 = help(n-2,qb);
        int ans = way1+way2;  
        qb[n] = ans;
        return ans;
    }
}