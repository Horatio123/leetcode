package org.beiganshan;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sort-colors
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
