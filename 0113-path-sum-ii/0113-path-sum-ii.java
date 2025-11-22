class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> subList = new ArrayList<>();
        sum(root, targetSum, 0, subList);
        return list;
    }

    public void sum(TreeNode root, int targetSum, int sum, List<Integer> subList) {

        if (root == null) {
            return;
        }
        sum += root.val;
        subList.add(root.val);

        if (root.left == null && root.right == null && sum == targetSum) {
            list.add(new ArrayList<>(subList));
        }

        sum(root.left, targetSum, sum, subList);
        sum(root.right, targetSum, sum, subList);
        subList.remove(subList.size() - 1);
    }
}