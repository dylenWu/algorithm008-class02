import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class N_ary_treepreorder_traversal {
    public class Node {
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
    }

    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> result = new LinkedList<Integer>();
        stack.addFirst(root);
        recurse(stack,result);
        return result;

    }
    public void recurse(LinkedList<Node> stack,LinkedList<Integer> result){
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            if(node!=null){
                result.addLast(node.val);
                Collections.reverse(node.children);
                for(Node child:node.children){
                    stack.addLast(child);
                }
            }
        }
    }
}
