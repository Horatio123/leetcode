package org.beiganshan;

public class ReverseWords_557 {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder();
        String[] strs = s.split(" ");
        for (String str: strs) {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >=0 ; i--) {
                sb.append(str.charAt(i));
            }
            res.append(sb).append(" ");

        }

        return res.toString().trim();
    }

}
