package org.beiganshan;

public class ReorganizeString_767 {
    public String reorganizeString(String S) {
        int[] charCount = new int[26];
        int maxCount = 0;
        int maxPosition = 0;
        for (char c: S.toCharArray()) {
            charCount[c - 'a'] ++;
        }
        for (int i = 0; i < charCount.length; i ++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxPosition = i;
            }
        }

        if (maxCount > (S.length() + 1) / 2) {
            return "";
        }

        StringBuilder sb = new StringBuilder(S);
        int pos = 0;
        for (int i = 0; i < maxCount; i++) {
            sb.setCharAt(pos, (char)(maxPosition + 'a'));
            pos = pos + 2;
        }


        for (int i = 0; i < charCount.length; i++) {
            while (charCount[i] != 0 && i != maxPosition) {
                if (pos >= S.length()) {
                    pos = 1;
                }
                sb.setCharAt(pos, (char)(i + 'a'));
                charCount[i] --;
                pos = pos + 2;
            }

        }

        return sb.toString();

    }

}
