class Solution {
public:
    bool isAnagram(string s, string t) {
        int n=s.length();
        int m=t.length();
        int cnt=0;
        if(n!=m)return false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if( s[i]==t[j]){
                
                t[j]='#';
                cnt++;
                break;
               }
            }
        }
        if(cnt==n){
            return true;
        }
        return false;
    }
};
