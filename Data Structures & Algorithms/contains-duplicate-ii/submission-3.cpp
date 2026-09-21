class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        // int i=0;
        // int j=i+1;
        // while(i<j){
        //     for(int l=i;l<n;l++){
        //          if(nums[l]==nums[j] && abs(i-j)<=k) return true;
        //     else j++;
        //     }
           
        // }
        int n =nums.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] ){
                    if(abs(i - j) <= k) return true;
                    
                }
            }
        }
         return false;
    }
};