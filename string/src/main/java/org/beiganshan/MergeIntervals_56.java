package org.beiganshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-intervals
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
