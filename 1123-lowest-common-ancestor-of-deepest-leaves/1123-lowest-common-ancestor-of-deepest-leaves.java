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
    int depth = 0;
    HashMap<TreeNode, Integer> map = new HashMap<>();;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        NodeandLevel(root, 0);
        return LCA(root);

    }

    TreeNode LCA(TreeNode root) {

        if (root == null)
            return root;
        if (map.get(root) == depth)
            return root;
        TreeNode left = LCA(root.left);
        TreeNode right = LCA(root.right);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;

        return right;
    }

    void NodeandLevel(TreeNode node, int height) {
        if (node == null)
            return;

        depth = Math.max(depth, height);
        map.put(node, height);

        NodeandLevel(node.left, height + 1);
        NodeandLevel(node.right, height + 1);
    }

}