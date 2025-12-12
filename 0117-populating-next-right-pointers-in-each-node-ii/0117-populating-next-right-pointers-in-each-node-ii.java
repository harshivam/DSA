/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return root;
        Queue<Node> q1 = new LinkedList<>();
        q1.offer(root);

        while (!q1.isEmpty()) {
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                Node curr = q1.poll();
                if (i < size - 1) {
                    curr.next = q1.peek();
                } else {
                    curr.next = null;
                }
                if (curr.left != null)
                    q1.offer(curr.left);
                if (curr.right != null)
                    q1.offer(curr.right);
            }
        }
        return root;
    }
}