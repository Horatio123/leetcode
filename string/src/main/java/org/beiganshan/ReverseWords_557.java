package org.beiganshan;
/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
