class Solution {
public:
    string simplifyPath(string path) {
        stringstream ss(path);
        string str;
        stack<string>st;
        while(getline(ss,str,'/')){
            if(!st.empty() && str=="..") st.pop();
            else if(str=="" || str==".") continue;

            else{
                if(str != ".."){
                    st.push(str);
                }
                
            }

        }
        string s="";
        stack<string>st2;
        while(!st.empty()){
          st2.push(st.top());
            st.pop();
        }
        while(!st2.empty()){
            s+="/"+st2.top();
            st2.pop();
        }
       if(s.empty()) s+="/";
        return s;
    }
};