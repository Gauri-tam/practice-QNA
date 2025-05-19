package org.activation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3}, {2, 6},
                {3, 5}, {8, 10},
                {15, 18}, {17, 20}
        }; // output of the [[1,6],[8,10],[15,18]]
      int[][] merged = merge(intervals);
        System.out.println(Arrays.deepToString(merged));
    }

    public static int[][] merge(int[][] intervalse) {

        Arrays.sort(intervalse, (a, b) -> a[0] - b[0]); // (a, b) -> a[0] - b[0];

        List<int[]> result = new ArrayList<>();
        int[] current = intervalse[0];
        result.add(current);
        for(int[] interval : intervalse){
            if(interval[0] <= current[1]){
                current[1] = Math.max(current[1], interval[1]);

            }else {
                result.add(current);
                current = interval;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}
