class Solution {
    public boolean hasDuplicate(int[] nums) {
      int n=nums.length;
    //   for(int i=0;i<n-1;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(nums[i]==nums[j])return true;
    //     }
    //   }
    //   return false;  
    HashSet<Integer> s=new HashSet<>();
    for(int x :nums){
        if(s.contains(x)){
            return true;
        }
        
        s.add(x);
    }
    return false;
    }
}