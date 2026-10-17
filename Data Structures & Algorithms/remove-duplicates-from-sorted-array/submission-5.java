class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       ArrayList<Integer>ans=new ArrayList<>();
       for(Map.Entry<Integer,Integer>it:mp.entrySet()){
        ans.add(it.getKey());
       }
      Collections.sort(ans);
      for(int i=0;i<ans.size();i++){
        nums[i]=ans.get(i);
      }
      
      return ans.size();
    }
}