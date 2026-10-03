class Solution {
    public int[] twoSum(int[] nums, int target) {

        //FIRST METHOD
        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target) return new int[] {i,j};
        //     }
            
        // }
        // return new int[] {};

        // SECOND METHOD
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(mpp.containsKey(rem)){
                return new int[] {mpp.get(rem),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
