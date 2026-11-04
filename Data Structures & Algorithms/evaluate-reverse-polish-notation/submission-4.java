class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")){
                int x=st.peek();
                st.pop();
                int y=st.peek();
                st.pop();
                int z=x+y;
                st.push(z);
            }
            else if(tokens[i].equals("-")){
                 int x=st.peek();
                st.pop();
                int y=st.peek();
                st.pop();
                int z=y-x;
                st.push(z);
            }
             else if(tokens[i].equals("*")){
                 int x=st.peek();
                st.pop();
                int y=st.peek();
                st.pop();
                int z=y*x;
                st.push(z);
            }
            else if(tokens[i].equals("/")){
                 int x=st.peek();
                st.pop();
                int y=st.peek();
                st.pop();
                int z=y/x;
                st.push(z);
            }
            else{
                int x=Integer.parseInt(tokens[i]);
                st.push(x);
            }
        }
        return st.peek();
    }
}
