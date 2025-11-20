/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        return bfs(root);
    }

    static ArrayList<Integer> bfs(TreeNode node){
        Queue<TreeNode> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(node==null) return ans;
        q.offer(node);
        while(!q.isEmpty()){
            
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<size;i++){
                TreeNode temp = q.poll();
                max = Math.max(max,temp.val);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            ans.add(max);
        }
        return ans;
    }
}