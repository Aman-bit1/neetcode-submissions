class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxl=0;
        for(int i=0;i<n;i++){
            int cnt=1;
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<n;j++){
             if(mp.containsKey(s.charAt(j))){
                break;
             }
              else{
                mp.put(s.charAt(j),j);
                cnt++;
              }
            }
            maxl=Math.max(maxl,cnt);

        }
        if(n==0) return 0;
        return maxl-1;
    }
}
