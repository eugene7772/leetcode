package problems.tree.easy;

import problems.tree.TreeNode;

public class Solution_101_Symmetric_Tree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricIn(root.left, root.right);
    }

    public static boolean isSymmetricIn(TreeNode l, TreeNode r) {
        if(l == null ) {
            if(r != null) {
                return false;
            }
        }

        if(r == null ) {
            if(l != null) {
                return false;
            }
        }
        if (l == null || r == null) {
            return true;
        }
        if (l.val == r.val) {
            if(!isSymmetricIn(l.left, r.right)) {
                return false;
            }
        } else {
            return false;
        }
        return isSymmetricIn(l.right, r.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        System.out.println(isSymmetric(root));
    }
}
