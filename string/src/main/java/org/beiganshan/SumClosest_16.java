package org.beiganshan;

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
