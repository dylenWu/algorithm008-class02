import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    //递归法
//         public TreeNode invertTree(TreeNode root) {
//         if(root==null) return null;
//         TreeNode temp = root.left;
//         root.left=root.right;
//         root.right = temp;
//         invertTree(root.left);
//         invertTree(root.right);
//         return root;
//     }
    //迭代法，其实也就是递归的迭代实现
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node !=null){
                TreeNode temp = node.left;
                node.left = node.right;
                node.right=temp;
                queue.add(node.right);
                queue.add(node.left);
            }
        }
        return root;
    }
}
