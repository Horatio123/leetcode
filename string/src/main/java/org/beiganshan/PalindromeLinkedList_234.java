package org.beiganshan;


import java.util.Stack;

public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode ll = head;
        Stack<Integer> s = new Stack<>();
        while (ll != null) {
            s.push(ll.val);
            ll = ll.next;
        }

        while (head != null) {
            if (s.pop() != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }

}
