class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
                int x=st.peek();
                st.pop();
                int y=st.peek();
                int z=x+y;
                st.push(x);
                st.push(z);
            }
           else if(operations[i].equals("C")){
                st.pop();
            }
          else  if(operations[i].equals("D")){
                int x=st.peek();
                int y=2*x;
                st.push(y);
            }
            else{

                int k=Integer.parseInt(operations[i]);
                st.push(k);
            }
            
        }
        
        int sum=0;
        while(!st.empty()){
            sum+=st.peek();
            st.pop();
        }
        return sum;
    }
}