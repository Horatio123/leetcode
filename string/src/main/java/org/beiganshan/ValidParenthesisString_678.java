package org.beiganshan;

import java.util.Stack;

/*
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parenthesis-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParenthesisString_678 {

//    public String processStar(String s) {
//        int countStar = 0;
//        int countLeft = 0;
//        int countRight = 0;
//        String result = new String(s);
//        for (Character c: s.toCharArray()) {
//            switch (c) {
//                case '*':
//                    countStar++;
//                    break;
//                case '(':
//                    countLeft++;
//                    break;
//                case ')':
//                    countRight++;
//                    break;
//            }
//        }
//        if (countLeft + countStar == countRight) {
//            result = s.replace('*', '(');
//        } else if (countRight + countStar == countLeft) {
//            result = s.replace('*', ')');
//        }
//
//        return result;
//
//    }

//    public boolean checkValidString(String s) {
//        String ss = processStar(s);
//        Stack<Character> stack = new Stack<>();
//
//        for (Character c: ss.toCharArray()) {
//            if (c.equals('(')) {
//                stack.push('C');
//            } else if (c.equals(')')) {
//                if (stack.empty()) {
//                    return false;
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//
//        return stack.size() == 0;
//
//    }

    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    left.push(i);
                    break;
                case '*':
                    star.push(i);
                    break;
                case ')':
                    if (!left.empty()) {
                        left.pop();
                    } else if (!star.empty()) {
                        star.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

//        if (left.size() == 0) {
//            return true;
//        } else {
//            int validStar = 0;
//            for (int i: star) {
//                if (i > left.peek()) {
//                    validStar++;
//                }
//            }
//
//            return validStar >= left.size();
//
//        }

        while (!left.empty() && !star.empty()) {
            if (left.pop() > star.pop()) {
                return false;
            }
        }
        return left.size() == 0;

    }

}
