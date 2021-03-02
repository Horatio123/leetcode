package org.beiganshan;

import java.util.ArrayList;

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
