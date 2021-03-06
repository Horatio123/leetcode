package org.beiganshan;
/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.


Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum-closest
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        int gap = Integer.MAX_VALUE;
        int sum;


        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j ++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - sum) < gap) {
                        gap = Math.abs(target - sum);
                        res = sum;
                    }
                }
            }
        }

        return res;

    }

}
