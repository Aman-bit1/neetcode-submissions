class Solution {
    public int longestConsecutive(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int maxl=Integer.MIN_VALUE;
        if (nums.length == 0) return 0;
        if(nums.length==1) return 1;
        while(j<n){
            int cnt=1;
            if(nums[j]-nums[i]==1 || nums[j]-nums[i]==0){
                while(j<n && (nums[j]-nums[i]==1 || nums[j]-nums[i]==0 )){
                    if(nums[j]-nums[i]==0){
                        i++;
            j++;
                    }
                    else{
                          cnt++;
            i++;
            j++;
                    }
          
         }
         maxl=Math.max(maxl,cnt);

            }
            else{
                maxl=Math.max(maxl,cnt);
                cnt=1;
                i++;
                j++;
            }
         
        }
        return maxl;
    }
}
