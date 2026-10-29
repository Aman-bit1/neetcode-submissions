class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int maxcnt=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cnt=0;
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>=target){
                    maxcnt=Math.min(maxcnt,cnt);
                }
                else{
                    cnt++;
                }
                
            }
            
        }
        if(maxcnt>target)return 0;
        return maxcnt+1;
    }
}