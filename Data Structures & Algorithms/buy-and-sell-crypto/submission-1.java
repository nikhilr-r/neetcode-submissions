class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0 ;
        int currp =0 ;
        /* Brute approach . take the O(n2) time com. 
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    currp = prices[j] - prices[i] ; 
                    maxp = Math.max(currp,maxp) ; 
                }
            }
        } */ 
    int minp = Integer.MAX_VALUE ;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<minp){
            minp = prices[i] ; 
        }else if(prices[i]>minp){
                 maxp = Math.max(prices[i]-minp,maxp) ; 
        }
    }
        return maxp ; 
    }
}
