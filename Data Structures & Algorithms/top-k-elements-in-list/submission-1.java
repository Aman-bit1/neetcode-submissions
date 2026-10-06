class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> mp=new HashMap<>();
        ArrayList <int[]> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer>it:mp.entrySet()){
            ans.add(new int[]{it.getKey(),it.getValue()});
        }
        ans.sort((a,b)->Integer.compare(b[1],a[1]));
         ArrayList<Integer>res=new ArrayList<>();
         for(int[] it:ans){
            res.add(it[0]);
         }
          ArrayList<Integer>fin=new ArrayList<>();
          int[] arr=new int[k];
         for(int i=0;i<k;i++){
          arr[i]=res.get(i);
         }
         return arr;

    }
}
