class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minNumber = 99999;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minNumber){
                minNumber = prices[i];
                
            }
            maxProfit = Math.max(maxProfit, prices[i] - minNumber);
        }
        return maxProfit;
    }
}


//  Another Solution - same approach

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < smallest){
                smallest = prices[i];
            }
            else{
                max = Math.max(prices[i] - smallest, max);
            }
        }
        return max;
    }
}
