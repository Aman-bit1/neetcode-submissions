class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int r=0;
        int maxl=0;
        int maxf=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        while(l<=r && r<n){
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            maxf=Math.max(maxf,mp.get(s.charAt(r)));
            while(((r-l+1)-maxf)>k){
                mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)-1);
                 
                 l++;
                
            }
           maxl=Math.max(maxl,r-l+1);
                r++;
        }
        return maxl;
    }
}
