class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,ArrayList<String>> mp=new HashMap<>();
      for(String it:strs){
        char[] arr=it.toCharArray();
        Arrays.sort(arr);

        String key=new String(arr);
        mp.putIfAbsent(key,new ArrayList<>());
        mp.get(key).add(it);


      }  
      List<List<String>> ans=new ArrayList<>();
      for(ArrayList<String>it:mp.values()){
        ans.add(it);
      }
      return ans;
    }
}
