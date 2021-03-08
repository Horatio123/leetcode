package org.beiganshan;

import java.lang.reflect.Array;
import java.util.*;

public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sum;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> ll = new ArrayList<>();
                            ll.add(nums[i]);
                            ll.add(nums[j]);
                            ll.add(nums[k]);
                            ll.add(nums[l]);
                            // sort list collection
                            Collections.sort(ll);
                            set.add(ll);
                        }
                    }
                }
            }

        }
        // convert set to array
        return new ArrayList<>(set);
    }

}
