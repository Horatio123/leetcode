package org.beiganshan;
/*
Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cool down period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.

 

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation:
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
Example 2:

Input: tasks = ["A","A","A","B","B","B"], n = 0
Output: 6
Explanation: On this case any permutation of size 6 would work since n = 0.
["A","A","A","B","B","B"]
["A","B","A","B","A","B"]
["B","B","B","A","A","A"]
...
And so on.
Example 3:

Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2
Output: 16
Explanation:
One possible solution is
A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/task-scheduler
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TaskScheduler_621 {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        int minTime = tasks.length;
        int maxTask = 0;
        int maxTaskCount = 0;
        for (char task: tasks) {
            taskCount[task - 'A'] ++;
            //System.out.println(task - 'A');
            //System.out.println(7 + 'A');
        }

        for (int count: taskCount) {
            maxTask = Math.max(count, maxTask);
        }

        for (int count: taskCount) {
            if (count == maxTask) {
                maxTaskCount++;
            }
        }

        return Math.max(minTime, (maxTask - 1) * (n + 1) + maxTaskCount);

    }

}
