class Solution {
public:
    int characterReplacement(string s, int k) {
        int n = s.size();
        int l=0;
        int h=0;
        unordered_map<char,int>mpp;
        int maxf=0;
        int maxl=0;
        while(l<=h && h<n){
          
          mpp[s[h]]++;
          maxf=max(maxf,mpp[s[h]]);
          
           
           while(((h-l+1)-maxf)>k) {
            mpp[s[l]]--;
            l++;
            
           }
            maxl=max(maxl,h-l+1);
            h++;
        }
        return maxl;
    }
};
