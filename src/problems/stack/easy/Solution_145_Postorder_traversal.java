package problems.stack.easy;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_145_Postorder_traversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return postorderTraversalRec(root, new ArrayList<>());
    }

    public static List<Integer> postorderTraversalRec(TreeNode root, List<Integer> result) {
        if(root.left != null) {
            postorderTraversalRec(root.left, result);
        }

        if(root.right != null) {
            postorderTraversalRec(root.right, result);
        }
        result.add(root.val);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }
}
