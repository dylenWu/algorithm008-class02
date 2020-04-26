import java.util.ArrayList;
import java.util.List;

class Binarytreepreordertraversa {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        recurse(root, result);
        return result;
    }

    public void recurse(TreeNode root, List<Integer> result) {
        if (root == null) return;
        recurse(root.left, result);
        recurse(root.right, result);
        result.add(root.val);
    }
}


