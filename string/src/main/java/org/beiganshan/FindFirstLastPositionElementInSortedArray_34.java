package org.beiganshan;

/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

Follow up: Could you write an algorithm with O(log n) runtime complexity?



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindFirstLastPositionElementInSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res;
        if (nums.length == 0) {
            res = new int[]{-1, -1};
            return res;

        }
        int pos = findNum(nums, target, 0, nums.length - 1);
        int first = pos;
        int last = pos;

        if (nums[pos] != target) {
            res = new int[]{-1, -1};
            return res;
        } else {
            // judge if index is out boundary
            while (first > 0 && nums[first - 1] == target) {
                first --;
            }
            while (last < nums.length - 1 && nums[last + 1] == target) {
                last ++;
            }

        }
        res = new int[]{first, last};
        return res;

    }
    public int findNum(int [] nums, int target, int begin, int end) {
        if (nums[begin] == target) return begin;
        if (nums[end] == target) return end;
        int mid = (begin + end) / 2;
        if (mid == begin) return begin;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target){
            return findNum(nums, target, mid, end);
        } else {
            return findNum(nums, target, begin, mid);
        }

    }

    public static void main(String[] args) {
        FindFirstLastPositionElementInSortedArray_34 find = new FindFirstLastPositionElementInSortedArray_34();
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] res = find.searchRange(nums, 8);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
