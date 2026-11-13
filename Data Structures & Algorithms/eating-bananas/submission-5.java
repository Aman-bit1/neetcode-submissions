class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
         int lo=1;
         int hi=piles[n-1];
         while(lo<=hi){
            int mid=(lo+hi)/2;
            int thours=0;
            for(int i=0;i<n;i++){
              if(piles[i]<=mid)thours++;
              else{
                double x=(double)piles[i]/mid;
                thours+=Math.ceil(x);
              } 



             
            }
             if(thours<=h){
                hi=mid-1;
             }
             else lo=mid+1;
         }
         return lo;
    }
}
