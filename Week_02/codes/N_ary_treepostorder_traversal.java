import java.util.LinkedList;
import java.util.List;

public class N_ary_treepostorder_traversal {

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
    }
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> output = new LinkedList<Integer>();
        stack.add(root);
        recurse(stack, output);
        return output;
    }

    public void recurse(LinkedList<Node> stack, LinkedList<Integer> output) {
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            if (node != null) {
                output.addFirst(node.val);
                for (Node child : node.children) {
                    if (child != null)
                        stack.add(child);
                }
            }
        }

    }
}