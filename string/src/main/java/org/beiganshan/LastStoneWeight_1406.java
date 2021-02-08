package org.beiganshan;

import java.util.PriorityQueue;

public class LastStoneWeight_1406 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i: stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first > second) {
                pq.add(first - second);
            }

        }
        return pq.isEmpty()? 0: pq.poll();
    }

    public static void main(String[] args) {
        int[] ss = {3, 7, 1, 9, 4};
        LastStoneWeight_1406 lastStoneWeight_1406 = new LastStoneWeight_1406();
        System.out.println(lastStoneWeight_1406.lastStoneWeight(ss));
    }

}
