package org.beiganshan;

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
