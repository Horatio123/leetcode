package org.beiganshan;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/roman-to-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Roman2Integer_13 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                res -= getValue(s.charAt(i));
            } else {
                res += getValue(s.charAt(i));
            }
        }
        res += getValue(s.charAt(s.length() - 1));

        return res;
    }

    public int getValue(char c) {
        int res = 0;
        switch (c) {
            case 'I': res = 1; break;
            case 'V': res = 5; break;
            case 'X': res = 10; break;
            case 'L': res = 50; break;
            case 'C': res = 100; break;
            case 'D': res = 500; break;
            case 'M': res = 1000; break;
        }
        return res;
    }


}
