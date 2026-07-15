class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.size();
         int i=0;
         int j=0;
         unordered_map<char,int>mpp;
         int maxlen=0;
         while(i<=j && j<n){
            
          if (mpp.find(s[j]) != mpp.end() && mpp[s[j]] >= i) {
                i = mpp[s[j]] + 1;
            }
            
            
          
           
           
           mpp[s[j]]=j;
            int len=j-i+1;
           maxlen=max(len,maxlen);
          j++;
          
         }
        return maxlen;
    }
};
