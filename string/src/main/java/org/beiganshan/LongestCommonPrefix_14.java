package org.beiganshan;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs.length == 0) {
            return res;
        } else if (strs.length == 1) {
            return strs[0];
        }

        res  = lcp(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            res  = lcp(res, strs[i]);
        }

        return res;
    }

    public String lcp(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }

}
