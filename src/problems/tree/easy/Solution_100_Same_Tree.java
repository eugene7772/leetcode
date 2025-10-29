package problems.tree.easy;

import problems.tree.TreeNode;

public class Solution_100_Same_Tree {
    private static boolean isSame = true;

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        return isSameTreeI(p, q);
    }

    public static boolean isSameTreeI(TreeNode p, TreeNode q) {
        if (!isSame) {
            return isSame;
        }
        if (p == null || q == null) {
            isSame = false;
            return isSame;
        }
        if (p.val != q.val) {
            isSame = false;
            return isSame;
        }
        if (p.left != null || q.left != null) {
            isSameTreeI(p.left, q.left);
            if (!isSame) {
                return isSame;
            }
        }
        if (p.right != null || q.right != null) {
            isSameTreeI(p.right, q.right);
            if (!isSame) {
                return isSame;
            }
        }
        return true;
    }

    //Нормальное решение
    public static boolean isSameTree2(TreeNode p, TreeNode q) {
        return ((p == null && q == null)
                || (p != null && q != null)
                && (p.val == q.val)
                && isSameTree2(p.left, q.left)
                && isSameTree2(p.right, q.right));
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree2(p, q));
    }
}
