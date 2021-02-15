package org.beiganshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));


        ArrayList<int[]> res = new ArrayList<>();

        res.add(intervals[0]);
        int leftBound;
        int rightBound;

        for (int i = 1; i < intervals.length; i++) {
            int[] curInterval = res.get(res.size() - 1);
            if (intervals[i][0] <= curInterval[1]) {
                leftBound = Math.min(intervals[i][0], curInterval[0]);
                rightBound = Math.max(intervals[i][1], curInterval[1]);
                res.remove(curInterval);
                res.add(new int[] {leftBound, rightBound});
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);

    }

}
