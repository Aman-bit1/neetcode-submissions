class Solution {
public:
    int maxProfit(vector<int>& nums) {
        int n= nums.size();
        int st=nums[n-1];
        
        int maxprofit=0;
        for(int i=n-2;i>=0;i--){
           int profit=st-nums[i];
            maxprofit=max(profit,maxprofit);
             if(st<nums[i]) st=nums[i];
        }
        return maxprofit;
    }
};
