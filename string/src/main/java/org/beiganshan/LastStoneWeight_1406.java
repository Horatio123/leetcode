package org.beiganshan;

import java.util.PriorityQueue;
/*
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/last-stone-weight
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LastStoneWeight_1406 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i: stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = 0;
            if (pq.size() > 0) second = pq.poll();
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
