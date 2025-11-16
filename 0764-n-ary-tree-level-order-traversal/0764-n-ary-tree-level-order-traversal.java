/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return Collections.emptyList();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> globalList = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<size;i++){
                Node node = q.poll();
                if(node!=null) list.add(node.val);
                for(Node nodeChild: node.children){
                q.add(nodeChild);
            }
            
         }
          globalList.add(list);
        }
    return globalList;    
    }
}