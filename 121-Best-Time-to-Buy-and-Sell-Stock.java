class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < min_price) {
                min_price = prices[i];
            }

            int current_profit = prices[i] - min_price;

            if(current_profit > profit) {
                profit = current_profit;
            }
        }

        return profit;
    }
}