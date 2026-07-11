class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        int n=arr.size();
        unordered_map<int,int>mpp;
        for(int i=0;i<n;i++){
            int rem=target-arr[i];
            if(mpp.find(rem)!=mpp.end()){
                return {mpp[rem]+1,i+1};
            }
            mpp[arr[i]]=i;
        }
        return {-1,-1};
    }
};
