package org.beiganshan;
/*
Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.

If possible, output any possible result.  If not possible, return the empty string.

Example 1:

Input: S = "aab"
Output: "aba"
Example 2:

Input: S = "aaab"
Output: ""


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reorganize-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
