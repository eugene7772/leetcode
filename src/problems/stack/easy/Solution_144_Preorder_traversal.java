package problems.stack.easy;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_144_Preorder_traversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        return preorderTraversalRec(root, result);
    }


    public static List<Integer> preorderTraversalRec(TreeNode root, List<Integer> result) {
        result.add(root.val);

        if (root.left != null) {
            preorderTraversalRec(root.left, result);
        }

        if (root.right != null) {
            preorderTraversalRec(root.right, result);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }
}
