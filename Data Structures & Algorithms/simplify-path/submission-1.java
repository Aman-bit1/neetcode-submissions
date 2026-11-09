class Solution {
    public String simplifyPath(String path) {
        int n=path.length();
        String[] arr=path.split("/");
        Stack<String>st=new Stack<>();
      
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(".") ){
               continue;
            }
            else if(arr[i].equals("...")) st.push(arr[i]);
           else if(st.empty() &&  arr[i].equals("..")) continue;
           else if(!st.empty() &&  arr[i].equals("..")) st.pop();
            else if (arr[i].isEmpty()) {
        continue;
    }
           else{
            st.push(arr[i]);
           }
        }
        
          Stack<String>st2=new Stack<>();
          while(!st.empty()){
            
            st2.push(st.peek());
            st.pop();
          }
        String s="";
        while(!st2.empty()){
            
            s+= "/" +  st2.peek() ;
          st2.pop();
        }
       if(s.length()==0) s+="/";
        return s;
    }
}