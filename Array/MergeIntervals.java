import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return intervals;
        List<int[]> list = new ArrayList<int[]>();
        list.add(intervals[0]);
        for(int i=1;i<n;i++){
            if(list.get(list.size()-1)[1] >= intervals[i][0]){
                int greater = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
                int smaller = Math.min(list.get(list.size()-1)[0], intervals[i][0]);
                list.get(list.size()-1)[0] = smaller;
                list.get(list.size()-1)[1] = greater;
            }
            else {
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
