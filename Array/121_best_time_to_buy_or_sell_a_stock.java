class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minProfit = prices[0];
        for(int i=0;i<prices.length;i++){
            minProfit= Math.min(prices[i],minProfit);
            int profit=prices[i]-minProfit;
            max=Math.max(profit,max);
        }
        return max;
    }
}