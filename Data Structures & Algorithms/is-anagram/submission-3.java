class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
    //     char[]arr=t.toCharArray();
    //   for(int i=0;i<s.length();i++){
    //     boolean flag=true;
    //     for(int j=0;j<arr.length;j++){
    //        if(s.charAt(i)==arr[j]){
    //         flag=false;
    //         arr[j]='#';
    //         break;
    //        }
    //     }
    //     if(flag==true) return false;
    //   }
    //   return true;
    int[] freq=new int[26];
    for(int i=0;i<s.length();i++){
        freq[ s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]!=0) return false;
    }
    return true;
    }
}
