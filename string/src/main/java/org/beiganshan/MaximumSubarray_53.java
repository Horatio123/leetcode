package org.beiganshan;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Constraints:

1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-subarray
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        // 5,4,-1,7,8
//        int max = nums[0];
//        int sum = 0;
//        for (int j = nums.length; j > 0; j--) {
//            for (int i = 0; i < j; i++) {
//                sum = 0;
//                for (int k = i; k < j; k++) {
//                    sum += nums[k];
//                }
//                if (sum > max) max = sum;
//            }
//        }
//        return max;
        if (nums.length == 1) return nums[0];
        //int[] sum = new int[nums.length];
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > max) max = sum;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        MaximumSubarray_53 maximumSubarray_53 = new MaximumSubarray_53();
        System.out.println(maximumSubarray_53.maxSubArray(nums));
    }

}
