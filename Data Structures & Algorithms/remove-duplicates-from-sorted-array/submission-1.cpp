class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        unordered_map<int,int>mpp;
        for(int i=0;i<nums.size();i++){
            mpp[nums[i]]++;
        }
        vector<int>ans;
        nums.clear();
        for(auto it:mpp){
          nums.push_back(it.first);
        }
        sort(nums.begin(),nums.end());
        return nums.size();

      
        
    }
};