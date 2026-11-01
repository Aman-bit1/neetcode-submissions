class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
             if(s.charAt(i)==')' ){
                 if(st.size()==0) return false;
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    break;
                }
                
            }
            if(s.charAt(i)==']' ){
                 if(st.size()==0) return false;
               if(st.peek()=='['){
                    st.pop();
                }
                else{
                    break;
                }
            }
            if(s.charAt(i)=='}' ){
                 if(st.size()==0) return false;
               if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    break;
                }
            }

        }
       
        if(st.empty() ) return true;
        else return false;
    }
}
