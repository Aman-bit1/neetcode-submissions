class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k=nums1.size();
        int l=nums2.size();

        int j=0;
        for(int i=0;i<k;i++){
            if(j<l && nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }
        sort(nums1.begin(),nums1.end());
        return;
    }
};