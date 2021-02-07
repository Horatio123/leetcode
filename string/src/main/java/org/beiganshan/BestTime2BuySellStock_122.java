package org.beiganshan;

public class BestTime2BuySellStock_122 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1] ) {
                maxProfit = maxProfit + prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

}
