package org.beiganshan;
/*
Given a linked list, swap every two adjacent nodes and return its head.

Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:

Input: head = []
Output: []

Example 3:

Input: head = [1]
Output: [1]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SwapNodesPairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode();
        ListNode front;
        ListNode back;
        ListNode point;

        start.next = head;
        point = start;
        while (point.next != null && point.next.next != null) {
            front = point.next;
            back = point.next.next;
            front.next = back.next;
            back.next = front;
            point.next = back;
            point = point.next.next;
        }

        return start.next;
    }

}
