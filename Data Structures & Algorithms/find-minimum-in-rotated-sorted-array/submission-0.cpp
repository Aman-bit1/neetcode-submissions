class Solution {
public:
    int findMin(vector<int> &nums) {
        int minl=INT_MAX;
        for(int i=0;i<nums.size();i++){
            minl=min(minl,nums[i]);
        }
        return minl;
    }
};
