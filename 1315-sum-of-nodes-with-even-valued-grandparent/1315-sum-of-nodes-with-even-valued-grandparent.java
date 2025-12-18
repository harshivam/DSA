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
    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {

        helper(root);

        return sum;

    }

    public void helper(TreeNode root) {
        if (root == null)
            return;
        if (root != null && root.val % 2 == 0) {
            if (root.left != null) {
                int sumleftChild = root.left.left != null ? root.left.left.val : 0;
                int sumrightChild = root.left.right != null ? root.left.right.val : 0;
                sum += sumleftChild + sumrightChild;
            }
            if (root.right != null) {
                int sumleftChild = root.right.left != null ? root.right.left.val : 0;
                int sumrightChild = root.right.right != null ? root.right.right.val : 0;
                sum += sumleftChild + sumrightChild;
            }

        }
        helper(root.left);
        helper(root.right);

    }
}