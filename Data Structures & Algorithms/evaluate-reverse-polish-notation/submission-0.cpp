class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        int n=tokens.size();
        stack<int>st;
        for(int i=0;i<n;i++){
            if(tokens[i]=="+" ){
                int a =st.top();
                st.pop();
                int b =st.top();
                st.pop();
                int sum=a+b;
                st.push(sum);
            }
           else if(tokens[i]=="-" ){
                int x =st.top();
                st.pop();
                int y =st.top();
                st.pop();
                int min=y-x;
                st.push(min);
            }
           else if( tokens[i]=="*" ){
                int p =st.top();
                st.pop();
                int q =st.top();
                st.pop();
                int mul=p*q;
                st.push(mul);
            }
           else if( tokens[i]=="/"){
                int y =st.top();
                st.pop();
                int z =st.top();
                st.pop();
                int div=z/y;
                st.push(div);
            }
            else{
                int x = stoi(tokens[i]);
                st.push(x);
            }
        }
        return st.top();
    }
};
