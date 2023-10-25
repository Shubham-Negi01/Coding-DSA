package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        int initialColor = image[sr][sc];
        if (initialColor == color)
            return image;
        ArrayList<Integer> pair = new ArrayList<Integer>(Arrays.asList(sr, sc));
        queue.add(pair);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = queue.remove();
            int i = list.get(0);
            int j = list.get(1);
            image[i][j] = color;
            if (i - 1 >= 0 && image[i - 1][j] == initialColor) {
                queue.add(new ArrayList<Integer>(Arrays.asList(i - 1, j)));
            }
            if (i + 1 < m && image[i + 1][j] == initialColor) {
                queue.add(new ArrayList<Integer>(Arrays.asList(i + 1, j)));
            }
            if (j - 1 >= 0 && image[i][j - 1] == initialColor) {
                queue.add(new ArrayList<Integer>(Arrays.asList(i, j - 1)));
            }
            if (j + 1 < n && image[i][j + 1] == initialColor) {
                queue.add(new ArrayList<Integer>(Arrays.asList(i, j + 1)));
            }
        }
        return image;
    }
}
