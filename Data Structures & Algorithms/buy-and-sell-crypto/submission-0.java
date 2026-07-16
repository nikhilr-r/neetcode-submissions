class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0 ;
        int currp =0 ;
        
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    currp = prices[j] - prices[i] ; 
                    maxp = Math.max(currp,maxp) ; 
                }
            }
        }
        return maxp ; 
    }
}
