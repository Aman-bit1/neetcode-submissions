class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>st=new Stack<>();
      int[] ans=new int[n];
      for(int i=0;i<n;i++){

        while(!st.empty() && temperatures[st.peek()]<temperatures[i]){
            int x=st.peek();
            st.pop();
            ans[x]=i-x;
        }
        st.push(i);

      }
      return ans;
    }
}
