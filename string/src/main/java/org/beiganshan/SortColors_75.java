package org.beiganshan;

public class SortColors_75 {
    public void sortColors(int[] nums) {
        int[] countNums = new int[3];

        for (int i: nums) {
            switch (i) {
                case 0:
                    countNums[0] ++;
                    break;
                case 1:
                    countNums[1] ++;
                    break;
                case 2:
                    countNums[2] ++;
                    break;
            }
        }

        int pos = 0;
        for (int i = 0; i < countNums.length; i++) {
            while (countNums[i] != 0) {
                nums[pos] = i;
                countNums[i] --;
                pos ++;
            }
        }
    }

}
