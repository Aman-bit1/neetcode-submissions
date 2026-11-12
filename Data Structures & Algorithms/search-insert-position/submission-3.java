class Solution {
    public int searchInsert(int[] nums, int target) {
      int x=nums.length;
      for(int i=0;i<x;i++){
        if(nums[i]>=target){
            return i;
          
        }
      } 
      return x; 
    }
}