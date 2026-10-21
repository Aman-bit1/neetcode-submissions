class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
        ArrayList<Integer>ans=new ArrayList<>();
        if(k>n){
            k=k%n;
        }
        for(int j=n-k;j<n;j++){
            ans.add(nums[j]);
        }
        for(int i=0;i<n-k;i++){
            ans.add(nums[i]);
        }
        int x=ans.size();
        for(int i=0;i<x;i++){
            nums[i]=ans.get(i);
        }
    }
}