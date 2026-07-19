class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        
        int n=s1.size();
        int m=s2.size();
       vector<char>need(26,0);
       vector<char>window(26,0);
       for(auto it:s1){
        need[it-'a']++;
       }
       int left=0;
       for(int right=0;right<m;right++){
        window[s2[right]-'a']++;
        if((right-left+1)>n){
            window[s2[left]-'a']--;
            left++;
        }
        if(need==window) return true;
        
       }
       return false;
    }
};
