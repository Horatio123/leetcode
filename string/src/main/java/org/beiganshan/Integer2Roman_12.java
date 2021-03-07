package org.beiganshan;

public class Integer2Roman_12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int w = num / 1000;
        int x = num % 1000 / 100;
        int y = num % 100 / 10;
        int z = num % 10;
        if (w != 0) {
            for (int i = 0; i < w; i++) {
                sb.append('M');
            }
        }
        if (x == 4) {
            sb.append('C');
            sb.append('D');
        } else if (x == 9) {
            sb.append('C');
            sb.append('M');
        } else if (x < 4) {
            for (int i = 0; i < x; i++) {
                sb.append('C');
            }
        } else {
            sb.append('D');
            for (int i = 0; i < x - 5; i++) {
                sb.append('C');
            }
        }

        if (y == 4) {
            sb.append('X');
            sb.append('L');
        } else if (y == 9) {
            sb.append('X');
            sb.append('C');
        } else if (y < 4) {
            for (int i = 0; i < y; i++) {
                sb.append('X');
            }
        } else {
            sb.append('L');
            for (int i = 0; i < y - 5; i++) {
                sb.append('X');
            }
        }

        if (z == 4) {
            sb.append('I');
            sb.append('V');
        } else if (z == 9) {
            sb.append('I');
            sb.append('X');
        } else if (z < 4) {
            for (int i = 0; i < z; i++) {
                sb.append('I');
            }
        } else {
            sb.append('V');
            for (int i = 0; i < z - 5; i++) {
                sb.append('I');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Integer2Roman_12 integer2Roman_12 = new Integer2Roman_12();
        System.out.println(integer2Roman_12.intToRoman(3678));
    }

}

