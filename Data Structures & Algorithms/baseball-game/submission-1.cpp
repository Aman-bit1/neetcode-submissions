class Solution {
public:
    int calPoints(vector<string>& s) {
        int n =s.size();
        stack<int>st;
        for(int i=0;i<n;i++){
            if(s[i]=="+"){
               int a =st.top();
               st.pop();
               int b= st.top();
               st.push(a);
               st.push(a+b);
            }
            else if(s[i]=="C")st.pop();
           else if(s[i]=="D"){
                int p=st.top()*2;
                st.push(p);
            }
           else{
            int a=stoi(s[i]);
            st.push(a);
           } 
        }
        vector<int>ans;
        while(!st.empty()){
            ans.push_back(st.top());
            st.pop();
        }
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans[i];
        }
        return sum;
    }
};