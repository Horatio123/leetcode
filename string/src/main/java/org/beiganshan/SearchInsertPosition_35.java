package org.beiganshan;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-insert-position
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        // 1,3,5,6
        if (target <= nums[0]) return 0;
        if (target == nums[nums.length - 1]) return nums.length - 1;
        if (target > nums[nums.length - 1]) return nums.length;
        int min = 0;
        int max = nums.length - 1;
        int middle = (max + min) / 2;
        while (max - min > 1) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target){
                max = middle;
            } else {
                min = middle;
            }
            middle = (max + min) / 2;
        }
        return min + 1;

    }

    public static void main(String[] args) {
        SearchInsertPosition_35 searchInsertPosition_35 = new SearchInsertPosition_35();
        int[] nums = {1,3,5,6};
        System.out.println(searchInsertPosition_35.searchInsert(nums, 4));
    }

}
