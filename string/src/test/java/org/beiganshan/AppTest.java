package org.beiganshan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_MostCommonWord_819() {
        MostCommonWord_819 mostCommonWord_819 = new MostCommonWord_819();
        String[] empty = new String[0];
        String[] strs = new String[] {"sf", "sdf"};
        String input1 = "bob";
        String input2 = "sss ss sss sdf sf";
        String s = mostCommonWord_819.mostCommonWord(input2, empty);
        System.out.println(s);
    }

    @Test
    public void test_LongestCommonPrefix_14() {
        LongestCommonPrefix_14 longestCommonPrefix_14 = new LongestCommonPrefix_14();

        String[] strs = new String[3];
        strs[0] = "flower";
        strs[1] = "flow";
        strs[2] = "flight";


        String[] strs1 = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix_14.longestCommonPrefix(strs));
    }

    @Test
    public void test_GenerateParentheses_22() {
        GenerateParentheses_22 generateParentheses_22 = new GenerateParentheses_22();
        List<String> ll = generateParentheses_22.generateParenthesis(5);
        for (String l: ll) {
            System.out.println(l);
        }

    }

    @Test
    public void test_TwoSum_1() {
        TwoSum_1 twoSum_1 = new TwoSum_1();
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,3};
        int[] res;
        res = twoSum_1.twoSum(nums2, 6);
        for (int r: res) {
            System.out.println(r);
        }
    }

    @Test
    public void test_InvalidTransactions_1169() {
        String[] strs = {"alice,20,800,mtv","alice,80,1200,beijing"};

        InvalidTransactions_1169 invalidTransactions_1169 = new InvalidTransactions_1169();

        List<String> ll = invalidTransactions_1169.invalidTransactions(strs);

        for (String s: ll) {
            System.out.println(s);
        }
    }

    @Test
    public void test_ReverseWords_557() {
        ReverseWords_557 reverseWords_557 = new ReverseWords_557();

        String ss = "Let's take LeetCode contest";

        System.out.println(reverseWords_557.reverseWords(ss));
    }

    @Test
    public void test_TransposeMatrix_867() {
        TransposeMatrix_867 transposeMatrix_867 = new TransposeMatrix_867();
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = transposeMatrix_867.transpose(A);

        for (int[] ints : B) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(ints[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Test
    public void test_TaskScheduler_621() {
        TaskScheduler_621 taskScheduler_621 = new TaskScheduler_621();
        char[]  tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(taskScheduler_621.leastInterval(tasks, 2));
    }

}
