class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int maxl=prices[n-1];
       int maxp=0;
       for(int i=n-1;i>=0;i--){
        int maxg=maxl-prices[i];
        maxp=Math.max(maxp,maxg);
        if(maxl<prices[i]){
            maxl=prices[i];
        }
       } 
       return maxp;
    }
}
