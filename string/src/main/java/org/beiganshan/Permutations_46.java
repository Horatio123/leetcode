package org.beiganshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Permutations_46 {
    public List<List<Integer>> permute(int[] nums) {
        //List<int[]> arrNum = Arrays.asList(nums);
        List<Integer> arrNum = new ArrayList<>();
        for (Integer num: nums) {
            arrNum.add(num);
        }
        List<List<Integer>> ll = new ArrayList<>();
        if (arrNum.size() == 1){
            ll.add(arrNum);
        } else if (arrNum.size() == 2) {
            ll.add(arrNum);
            List<Integer> nums2 = new ArrayList<>(arrNum.size());
            //int tmp = nums.get(0);

            nums2.add(arrNum.get(1));
            nums2.add(arrNum.get(0));
            ll.add(nums2);
        } else {
            for (Integer num: arrNum) {
                int[] param = new int[arrNum.size() - 1];
                int point = 0;
                for (int nu: arrNum) {
                    if (nu == num) continue;
                    param[point] = nu;
                    point++;
                }
//                    List<Integer> param = new ArrayList<>();
//                for (int nu: arrNum) {
//                    param.add(nu);
//                }
//                param.remove(num);
//                param.toArray(new int[arrNum.size() - 1]);
                List<List<Integer>> gl = permute(param);
                for (List<Integer> li: gl) {
                    li.add(num);
                    ll.add(li);
                }
            }
        }
        return ll;
    }

//    public List<List<Integer>> generateAll(List<Integer> nums) {
//        List<List<Integer>> ll = new ArrayList<>();
//        if (nums.size() == 1){
//            ll.add(nums);
//        } else if (nums.size() == 2) {
//            ll.add(nums);
//            List<Integer> nums2 = new ArrayList<>(nums.size());
//            //int tmp = nums.get(0);
//
//            nums2.add(nums.get(1));
//            nums2.add(nums.get(0));
//            ll.add(nums2);
//        } else {
//            for (Integer num: nums) {
//                List<Integer> param = new ArrayList<>();
//                for (Integer nu: nums) {
//                    param.add(nu);
//                }
//                param.remove(num);
//                List<List<Integer>> gl = generateAll(param);
//                for (List<Integer> li: gl) {
//                    li.add(num);
//                    ll.add(li);
//                }
//            }
//        }
//        return ll;
//
//    }

    public static void main(String[] args) {
        Permutations_46 permutations_46 = new Permutations_46();
        int[] l = new int[]{1, 2, 3};
//        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ll;
//        l.add(1);
//        l.add(2);
//        l.add(3);
        ll = permutations_46.permute(l);
        System.out.println(ll);
    }

}
