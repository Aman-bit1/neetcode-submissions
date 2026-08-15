class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int minSub=INT_MAX;
            for(int i=0;i<nums.size();i++){
                int sum=0;
                vector<int>arr;
                for(int j=i;j<nums.size();j++){
                    sum+=nums[j];
                    arr.push_back(nums[j]);
                    if(sum>=target){
                        int n=arr.size();
                        minSub=min(minSub,n);
                        break;
                    }
                }
            }
            if(minSub==INT_MAX) return 0;
            return minSub;
    }
};