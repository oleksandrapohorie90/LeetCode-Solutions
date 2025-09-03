class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];// update the minimum
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            }
        }

        return maxProfit;
    }
}