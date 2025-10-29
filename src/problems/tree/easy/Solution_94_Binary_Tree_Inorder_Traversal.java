package problems.tree.easy;

import problems.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_94_Binary_Tree_Inorder_Traversal {

    // Симметричный обход дерева
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        return inorder(root, new ArrayList<>());
    }

    private static List<Integer> inorder(TreeNode root, List<Integer> result) {
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }

        if (root.left != null) {
            inorder(root.left, result);
        }
        if (root.right != null) {
            result.add(root.val);
            inorder(root.right, result);
        } else {
            result.add(root.val);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
        System.out.println(inorderTraversal(root));
    }

}
