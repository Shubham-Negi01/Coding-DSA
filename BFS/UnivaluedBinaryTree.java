package BFS;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }

        if(root.left!=null && root.left.val == root.val){
            return isUnivalTree(root.left);
        }

        if(root.right!=null && root.right.val == root.val){
            return isUnivalTree(root.right);
        }
        return false;
    }
}
