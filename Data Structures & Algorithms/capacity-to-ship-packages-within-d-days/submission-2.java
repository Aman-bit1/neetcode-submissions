class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
          max=Math.max(max,weights[i]);
          sum+=weights[i];  
        }
        int lo=max;
        int hi=sum;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int day=1;
            int maxsum=0;
            for(int i=0;i<n;i++){
                maxsum+=weights[i];
                if(maxsum>mid){
                    day++;
                    maxsum=weights[i];
                }
               
            }
            // double x=(double)maxsum/mid;
            // int data=Math.ceil(x);
            if(day<=days){
                hi=mid-1;
            }
            if(day>days){
                lo=mid+1;
            }
        }
        return lo;
    }
}