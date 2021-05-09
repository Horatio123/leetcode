package org.beiganshan;

import java.util.ArrayList;
import java.util.List;
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/generate-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        generateAll(new char[2 * n],0, res);
        return res;

    }

    public void generateAll(char[] current, int pos, ArrayList<String> strs) {
        if (current.length == pos) {
            if (valid(new String(current))) {
                strs.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, strs);
            current[pos] = ')';
            generateAll(current, pos + 1, strs);
        }

    }

    public boolean valid(String s) {
        int balance = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }

}
