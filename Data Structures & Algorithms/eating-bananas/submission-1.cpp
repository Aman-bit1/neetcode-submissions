class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        sort(piles.begin(),piles.end());
         int n =piles.size();
        // int min=INT_MAX;
        // int temp;
        // for(int i=piles[n-1];i>=1;i--){
        //     temp=0;
        //     int j=0;
        //     while(j<n){
        //         if(piles[j]<=i){
        //             temp++;
        //             j++;
                    
        //         } 
        //         else{
        //             temp+=ceil((double)piles[j] / i);
        //             j++;
        //         }
        //     }
        //     if(temp>h){
        //         min=i;
        //         break;
        //     } 
        // }
        // return min+1;
        int maxnum=INT_MIN;
        for(int i=0;i<n;i++){
            maxnum=max(maxnum,piles[i]);
        }
        int lo=1;
        int hi=maxnum;
        int ans=INT_MAX;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int thours=0;
            for(int i=0;i<piles.size();i++){
                if(piles[i]<=mid){
                    thours++;
                }
                else{
                    thours+=ceil((double)piles[i] / mid);

                }
            }
            if(thours>h){
                lo=mid+1;
            }
            else{
               
                hi=mid-1;
            }
        }
        return lo;
    }
};
