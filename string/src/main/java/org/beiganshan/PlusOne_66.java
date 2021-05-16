package org.beiganshan;

import java.util.Arrays;

/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/plus-one
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        int carry = 1;
        int value;
        for (int i = digits.length - 1;i > -1; i--) {
            value = digits[i] + carry;
            res[i] = value % 10;
            carry = value / 10;
        }

        if (carry == 1) {
            int[] resWithCarry = new int[digits.length + 1];
            resWithCarry[0] = 1;
            System.arraycopy(res, 0, resWithCarry, 1, resWithCarry.length - 1);
            return resWithCarry;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        //2147483647
        PlusOne_66 plusOne_66 = new PlusOne_66();
        System.out.println(Arrays.toString(plusOne_66.plusOne(digits)));
    }

}
