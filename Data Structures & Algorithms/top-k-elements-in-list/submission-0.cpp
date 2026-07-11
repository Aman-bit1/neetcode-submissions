class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
 unordered_map<int,int> mpp;
 for(auto it:nums){
    mpp[it]++;
 }
 vector<pair<int,int>>v;
 for(auto it:mpp){
    v.push_back({it.second,it.first}) ;//{freqency,number}
 }
 sort(v.rbegin(),v.rend());
 vector<int>ans;
 for(int i=0;i<k;i++){
    ans.push_back({v[i].second});
 }
 return ans;
    }
};
