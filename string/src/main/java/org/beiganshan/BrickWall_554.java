package org.beiganshan;

import java.util.HashMap;
import java.util.List;

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
