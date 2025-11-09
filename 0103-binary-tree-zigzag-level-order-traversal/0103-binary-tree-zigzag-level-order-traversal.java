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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return Collections.emptyList();
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList();
        q1.add(root);
        int z = 0;
        while (!q1.isEmpty()) {
            int size = q1.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q1.poll();
                if (node != null) {
                    if (z % 2 == 0) {
                        levelList.addLast(node.val);
                    } else {
                        levelList.addFirst(node.val);
                    }
                }
                if(node.left!=null) q1.offer(node.left);
                if(node.right!=null) q1.offer(node.right);
            }
            z++;
            list.add(levelList);
        }
        return list;
    }
}