package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length; 
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    Queue<List<Integer>> queue = new LinkedList<>();
                    queue.add(new ArrayList<>(Arrays.asList(i,j)));
                    grid[i][j] = '2';
                    while(!queue.isEmpty()){
                        ArrayList<Integer> list = (ArrayList<Integer>) queue.remove();
                        int r = list.get(0);
                        int c = list.get(1);
                        if((r-1)>=0 && grid[r-1][c]=='1'){
                            queue.add(new ArrayList<>(Arrays.asList(r-1,c)));
                            grid[r-1][c] = '2';
                        }
                        if((r+1)<m && grid[r+1][c]=='1'){
                            queue.add(new ArrayList<>(Arrays.asList(r+1,c)));
                            grid[r+1][c] = '2';
                        }
                        if((c-1)>=0 && grid[r][c-1]=='1'){
                            queue.add(new ArrayList<>(Arrays.asList(r,c-1)));
                            grid[r][c-1] = '2';
                        }
                        if((c+1)<n && grid[r][c+1]=='1'){
                            queue.add(new ArrayList<>(Arrays.asList(r,c+1)));
                            grid[r][c+1] = '2';
                        }
                    }
                }
            }
        }
        return islands;
    }
}
