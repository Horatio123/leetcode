package org.beiganshan;

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
            case 'I':
                res = 1;
                break;
            case 'V':
                res = 5;
                break;
            case 'X':
                res = 10;
                break;
            case 'L':
                res = 50;
                break;
            case 'C':
                res = 100;
                break;
            case 'D':
                res = 500;
                break;
            case 'M':
                res = 1000;
                break;
        }
        return res;
    }


}
