package BFS;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode newRoot = null;
        if (root1 != null && root2 != null) {
            TreeNode left = mergeTrees(root1.left, root2.left);
            TreeNode right = mergeTrees(root1.right, root2.right);
            newRoot = new TreeNode(root1.val + root2.val, left, right);
        } else if (root1 != null && root2 == null) {
            TreeNode left = mergeTrees(root1.left, null);
            TreeNode right = mergeTrees(root1.right, null);
            newRoot = new TreeNode(root1.val, left, right);
        } else if (root1 == null && root2 != null) {
            TreeNode left = mergeTrees(null, root2.left);
            TreeNode right = mergeTrees(null, root2.right);
            newRoot = new TreeNode(root2.val, left, right);
        }
        return newRoot;
    }
}
