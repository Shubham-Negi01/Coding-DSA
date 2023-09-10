package BFS;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null) {
            return true;
        }

        return areSymmetricChildren(root.left, root.right);
    }

    public static boolean areSymmetricChildren(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if ((a != null && b == null) || (a == null && b != null)) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }

        return areSymmetricChildren(a.left, b.right) &&
                areSymmetricChildren(a.right, b.left);
    }
}
