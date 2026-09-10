class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int n=weights.size();
        int maxl=INT_MIN;
        int minl=INT_MAX;
        int sum=0;
        for(int i=0;i<n;i++){
            maxl=max(maxl,weights[i]);
            sum+=weights[i];
        }
       int lo=maxl;
       int hi=sum;
       while(lo<=hi){
        int mid=(lo+hi)/2;
        
            int limit=0;
            int din=1;
        for(int i=0;i<n;i++){
         
            if(limit + weights[i]>mid){
                din++;
                limit=weights[i];
            }
            else{
                limit+=weights[i];
            }
            
        }
        if(din>days){
           
            lo=mid+1;
        }
        else{
            hi=mid-1;
        }
       }
       return lo;
    }
};