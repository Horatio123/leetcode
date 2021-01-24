package org.beiganshan;

import java.util.ArrayList;
import java.util.List;

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
