package org.beiganshan;

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
