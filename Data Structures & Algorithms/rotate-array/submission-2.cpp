class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
        k=k%n;
        // reverse
       reverse(nums.begin(),nums.end());
       int j=k-1;
       for(int i=0;i<k-1;i++){
        int x=nums[i];
        int y=nums[j];
        if(i<j){
           nums[i]=y;
        nums[j]=x;
        j--;
        }
        
        
       }
       int l=n-1; 
       for(int i=k;i<n;i++){
            int a=nums[i];
            int b=nums[l];
            if(i<l){
              nums[i]=b;
              nums[l]=a;
              l--;
            }
            

       }
    }
};