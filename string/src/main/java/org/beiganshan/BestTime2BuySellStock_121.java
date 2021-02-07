package org.beiganshan;

public class BestTime2BuySellStock_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i: prices) {
            if (minPrice > i) {
                minPrice = i;
            }

            if (i - minPrice > maxProfit) {
                maxProfit = i - minPrice;
            }
        }

        return maxProfit;

    }

}
