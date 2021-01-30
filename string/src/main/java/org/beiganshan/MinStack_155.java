package org.beiganshan;

import java.util.ArrayList;

public class MinStack_155 {
    ArrayList<Integer> arr;

    /** initialize your data structure here. */
    public MinStack_155() {
        arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        int min = arr.get(0);
        for (int i: arr) {
            min = Math.min(min, i);
        }
        return min;

    }

}
