package org.beiganshan;

import java.util.Stack;

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
