class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int i=0;
      int j=1;
      int maxp=0;
      
      while(j<n){
        if(prices[j]>prices[j-1]){
          while(j<n && prices[j]>prices[j-1]){
            j++;
        }
        int x=prices[j-1]-prices[i];
        maxp+=x;
        }
        
    else{
         i=j;
       j++;
       
    }
    
       
      }
      return maxp;
    }
}