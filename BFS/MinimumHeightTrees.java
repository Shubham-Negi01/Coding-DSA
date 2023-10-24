package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinimumHeightTrees {

    private int dfs(int root, Map<Integer, Set<Integer>> adjList) {
        if(!adjList.containsKey(root)){
            return 0;
        }
        int maxHeight = 0;
        for(int node : adjList.get(root)){
            maxHeight = Math.max(maxHeight, dfs(node, adjList));
        }
        return maxHeight+1;
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();

        Map<Integer,Set<Integer>> adjList = new HashMap<>();

        for(int i=0;i<n-1;i++){
            if(adjList.containsKey(edges[i][0])){
                adjList.get(edges[i][0]).add(edges[i][1]);
            }
            else{
                Set<Integer> neighbours = new HashSet<>(Arrays.asList(edges[i][1]));
                adjList.put(edges[i][0], neighbours);
            }
            if(adjList.containsKey(edges[i][1])){
                adjList.get(edges[i][1]).add(edges[i][0]);
            }
            else{
                Set<Integer> neighbours = new HashSet<>(Arrays.asList(edges[i][0]));
                adjList.put(edges[i][1], neighbours);
            }
        }

        int minHeight = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int treeHeight = dfs(i,adjList);
            if(treeHeight<minHeight){
                list.clear();
                list.add(i);
            }
            else if(treeHeight==minHeight){
                list.add(i);
            }
        }
        return list;
    }

}
