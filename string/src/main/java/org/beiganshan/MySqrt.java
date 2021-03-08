package org.beiganshan;

public class MySqrt {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(3));
    }
}
