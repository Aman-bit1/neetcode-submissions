class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int n=word1.size();
        int m=word2.size();
        string s="";
        int i=0;
        int j=0;
        while(i<n || j<m){
            bool found=true;
            if(i<n && found==true) {
                s+=word1[i];
                i++;
               
            }
             found=false;
            if(j<m && found!=true ){
                s+=word2[j];
                j++;
            } 
            
        }
        return s;
    }
};