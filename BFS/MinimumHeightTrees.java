package BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumHeightTrees {

    private int dfs(int i, List<Set<Integer>> adjList, boolean[] visited) {
        if(visited[i]){
            return 0;
        }
        visited[i] = true;
        int maxHeight = 0;
        for(int node: adjList.get(i)){
            maxHeight = Math.max(maxHeight,dfs(node, adjList, visited));
        }
        return maxHeight + 1;
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Set<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<n;i++){
            adjList.add(new HashSet<Integer>());
        }

        for(int i=0;i<n-1;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        List<Integer> mhtList = new ArrayList<>();

        int minHeight = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            boolean[] visited = new boolean[n];
            int height = dfs(i,adjList,visited);
            System.out.println("root="+i+" height="+height);
            if(height < minHeight){
                minHeight = height;
                mhtList.clear();
                mhtList.add(i);
            }
            else if(height == minHeight){
                mhtList.add(i);
            }
        }

        return mhtList;
    }

}
