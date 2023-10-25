package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgList = new ArrayList<>(); 
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            double size = queue.size();
            double sum = 0;
            for(int i=0;i<size;i++){
                TreeNode node= queue.remove();
                sum+=node.val;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            avgList.add(sum/size);
        }
        return avgList;
    }
}
