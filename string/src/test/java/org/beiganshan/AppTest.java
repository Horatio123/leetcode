package org.beiganshan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
}
