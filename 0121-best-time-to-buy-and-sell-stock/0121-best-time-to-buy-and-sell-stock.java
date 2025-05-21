class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxpro = 0;
        for (int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];

                
            }
            maxpro = Math.max(maxpro,prices[i]-buy);
        }
        return maxpro;


    }
}