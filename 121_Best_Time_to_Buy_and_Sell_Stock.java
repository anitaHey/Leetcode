/**
 * Runtime: 1 ms, faster than 88.29% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int a = 0 ; a < prices.length ; a++){
            if(prices[a] < min) min = prices[a];
            else if(prices[a] - min > maxprofit) maxprofit = prices[a] - min;
        }
        
        return maxprofit;
    }
}
