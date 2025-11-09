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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return Collections.emptyList();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> list  = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            List<TreeNode> level = new LinkedList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                if(node!=null){
                    level.addFirst(node);
                    if(node.left!=null) q.offer(node.left);
                    if(node.right!=null) q.offer(node.right);
                }
            }
            list.add(level.get(0).val);
        }
        return list;
    }
}