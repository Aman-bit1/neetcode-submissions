class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0;
        int j=0;
        String s="";
        while(i<n || j<m){
            
            if(i<n){
                s+=word1.charAt(i);
                i++;
            }
            if(j<m){
                s+=word2.charAt(j);
                j++;
            }
        }
        return s;
    }
}