
class Solution {
    int ans = 0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        helper(root,Integer.MIN_VALUE);
        return ans;
    }

    public void helper(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max){
            max = root.val;
            ans+=1;
        }
        helper(root.left,max);
        helper(root.right,max);
    }
}