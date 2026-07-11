class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        int i=0;
        int j=1;
        int curr=1;
        int longest=1;
        if(n==0)return 0;
        while(i<j &&j<n){
            if(nums[j]-nums[i]==1){
                curr++;
                i++;j++;
            }
            else if(nums[j]-nums[i]==0){
                i++;
                j++;
            }
            else{
               longest=max(curr,longest);
               curr=1;
               i++;j++;
                
            }
           
            
        }
      
       longest=max(curr,longest);
       return longest;
    }
};
