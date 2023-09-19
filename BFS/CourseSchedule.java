package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule {
    private boolean dfs(int i, Map<Integer, List<Integer>> map, boolean[] visited, boolean[] stack) {
        if (stack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        stack[i] = true;
        if (!map.containsKey(i)) {
            stack[i] = false;
            return false;
        }
        for (int adj : map.get(i)) {
            if (dfs(adj, map, visited, stack)) {
                return true;
            }
        }
        stack[i] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>(numCourses);

        int m = prerequisites.length;
        if (m == 0) {
            return true;
        }
        for (int i = 0; i < m; i++) {
            int node = prerequisites[i][0];
            if (!map.containsKey(node)) {
                map.put(node, new ArrayList<Integer>(Arrays.asList(prerequisites[i][1])));
            } else {
                map.get(node).add(prerequisites[i][1]);
            }
        }
        boolean visited[] = new boolean[numCourses];
        boolean stack[] = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, map, visited, stack)) {
                return false;
            }
        }

        return true;
    }
}
