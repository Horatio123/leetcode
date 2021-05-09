package org.beiganshan;

import java.util.ArrayList;
/*
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row N and index K, return the K-th indexed symbol in row N. (The values of K are 1-indexed.) (1 indexed).

Examples:
Input: N = 1, K = 1
Output: 0

Input: N = 2, K = 1
Output: 0

Input: N = 2, K = 2
Output: 1

Input: N = 4, K = 5
Output: 1

Explanation:
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/k-th-symbol-in-grammar
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KSymbolInGrammar_779 {
    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        int len = (int)Math.pow(2, N - 1) ;
        if (K > len / 2) {
            return kthGrammar(N - 1, K - len / 2) == 1? 0: 1;
        } else {
            return kthGrammar(N - 1, K);
        }
    }

    public static void main(String[] args) {
        KSymbolInGrammar_779 kSymbolInGrammar_779= new KSymbolInGrammar_779();
        int res = kSymbolInGrammar_779.kthGrammar(3, 1);
        System.out.println(res);
    }


}
