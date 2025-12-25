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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        int level = 0;
        while (!q1.isEmpty()) {
            int size = q1.size();
            LinkedList<TreeNode> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q1.poll();
                list.add(node);
                if(node.left!=null) q1.offer(node.left);
                if(node.right!=null) q1.offer(node.right);
            }
               if(level%2!=0){
                int i = 0;
                int j = list.size()-1;
                while(i<j){
                    int temp = list.get(j).val;
                    list.get(j).val = list.get(i).val;
                    list.get(i).val = temp;
                    i++;
                    j--;
                }
               }
               level++;
        }
        return root;
    }
}