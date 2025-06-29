class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        // int right = 1;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[left] < prices[i]){
                int profit = prices[i] - prices[left];
            maxProfit = Math.max(profit, maxProfit);
            } else{
                left = i;
            }
            
        }

        return maxProfit;

    }
}