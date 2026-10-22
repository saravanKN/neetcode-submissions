class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxValue = 0;

        for(int right = 1; right< prices.length; right++){
            if(prices[left]<prices[right]){
                int currentProfit = prices[right] - prices[left];
                maxValue = Math.max(maxValue, currentProfit);
            }
            else {
                left = right;
            }
        }
        return maxValue;
    }
}
