package org.beiganshan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Arrays;
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

    @Test
    public void test_MinStack_155() {
        MinStack_155 minStack = new MinStack_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2

    }

    @Test
    public void test_validParenthesisString_678() {
        //String s = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
        //"**((*"
        String s = "()*()(()(*()(((())()()())*))()*()(*)(((*))(())(())((*()*(()(())()*(((*(**))((())*)(((()()))(())()))";
        //"*(****(*((**(*****"
        ValidParenthesisString_678 validParenthesisString_678 = new ValidParenthesisString_678();
        System.out.println(validParenthesisString_678.checkValidString(s));

    }

    @Test
    public void test_PalindromeLinkedList_234() {
        PalindromeLinkedList_234 palindromeLinkedList_234 = new PalindromeLinkedList_234();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(1, l2);
        System.out.println(palindromeLinkedList_234.isPalindrome(l3));
    }

    @Test
    public void test_BrickWall_554() {
        BrickWall_554 brickWall_554 = new BrickWall_554();

        List<Integer> bricks1 = Arrays.asList(1, 2, 2, 1);
        List<Integer> bricks2 = Arrays.asList(3,1,2);
        List<Integer> bricks3 = Arrays.asList(1,3,2);
        List<Integer> bricks4 = Arrays.asList(2,4);
        List<Integer> bricks5 = Arrays.asList(3,1,2);
        List<Integer> bricks6 = Arrays.asList(1,3,1,1);
        List<List<Integer>> wall = Arrays.asList(bricks1, bricks2, bricks3, bricks4, bricks5, bricks6);

        System.out.println(brickWall_554.leastBricks(wall));
    }

    @Test
    public void test_BestTime2BuySellStock() {
        BestTime2BuySellStock_121 bestTime2BuySellStock_121 = new BestTime2BuySellStock_121();
        BestTime2BuySellStock_122 bestTime2BuySellStock_122 = new BestTime2BuySellStock_122();
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(bestTime2BuySellStock_121.maxProfit(prices2));
        System.out.println(bestTime2BuySellStock_122.maxProfit(prices));
    }

    @Test
    public void test_LastStoneWeight_1406() {
        int[] ss = {3, 7, 1, 9, 4};
        LastStoneWeight_1406 lastStoneWeight_1406 = new LastStoneWeight_1406();
        System.out.println(lastStoneWeight_1406.lastStoneWeight(ss));

    }

}
