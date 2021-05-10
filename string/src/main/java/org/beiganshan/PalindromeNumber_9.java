package org.beiganshan;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/palindrome-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/*
一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。

这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。

poll，remove 区别：

remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。

peek，element区别：

element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。


 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        Stack<Integer> stack = new Stack<>();
        //PriorityQueue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue= new LinkedList<>();
        int num;
        while (x > 0) {
            num = x % 10;
            x = x / 10;
            stack.push(num);
            queue.add(num);
        }

        while (!stack.empty()) {
            if (! stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber_9 palindromeNumber_9 = new PalindromeNumber_9();
        System.out.println(palindromeNumber_9.isPalindrome(121));
    }
}
