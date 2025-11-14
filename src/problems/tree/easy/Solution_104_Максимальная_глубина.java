package problems.tree.easy;

import problems.tree.TreeNode;

public class Solution_104_Максимальная_глубина {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return maxDepthRec(root, 0);
    }

    public static int maxDepthRec(TreeNode root, int count) {
        count++;
        if(root == null) {
            return count;
        }
        int max = Math.max(root.left == null? count : maxDepthRec(root.left, count),root.right == null? count : maxDepthRec(root.right, count));
        return max;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2));
        System.out.println(maxDepth(treeNode));
    }
}
