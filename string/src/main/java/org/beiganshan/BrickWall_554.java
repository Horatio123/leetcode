package org.beiganshan;

import java.util.HashMap;
import java.util.List;
/*
There is a rectangular brick wall in front of you with n rows of bricks. The ith row has some number of bricks each of the same height (i.e., one unit) but they can be of different widths. The total width of each row is the same.

Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a brick, then the brick is not considered as crossed. You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.

Given the 2D array wall that contains the information about the wall, return the minimum number of crossed bricks after drawing such a vertical line.



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/brick-wall
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BrickWall_554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> ll: wall) {
            int length = 0;
            int num;
            // last brick should exclude
            for (int i = 0; i < ll.size() - 1; i++) {
                length += ll.get(i);
                num = map.getOrDefault(length, 0);
                map.put(length, num + 1);
            }
        }

        int edges = 0;
        for (int i: map.values()) {
            if (i > edges) {
                edges = i;
            }
        }

        return wall.size() - edges;
    }

}
