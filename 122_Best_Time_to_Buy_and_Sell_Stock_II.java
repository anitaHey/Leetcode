/**
 *Runtime: 1 ms, faster than 94.98% of Java online submissions for Best Time to Buy and Sell Stock II.
 *Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int a = 0;a<prices.length-1;a++){
            if(prices[a]<prices[a+1]){
                maxprofit += prices[a+1] - prices[a];
            }
        }
        
        return maxprofit;
    }
}
