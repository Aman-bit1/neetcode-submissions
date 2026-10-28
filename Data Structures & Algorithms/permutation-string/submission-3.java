class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
       int[] need=new int[26];
       int[] window =new int[26];
         for(int i=0;i<n;i++){
            window[s1.charAt(i)-'a']++;
         }
        int left=0;
        for(int right=0;right<m;right++){
              need[s2.charAt(right)-'a']++;
              if((right-left+1)>n ){
                need[s2.charAt(left)-'a']--;
                left++;
              }
              if(Arrays.equals(need,window)) return true;
        }
        return false;
        
       
    }
}
