class MinStack {

    public MinStack() {
        
    }
    Deque<Integer>st=new ArrayDeque<>();
    Deque<Integer>st1=new ArrayDeque<>();
    public void push(int val) {
      st.offerLast(val);  
    }
    
    public void pop() {
        st.pollLast();
    }
    
    public int top() {
       return st.peekLast();
    }
    
    public int getMin() {
        int minst=Integer.MAX_VALUE;
        while(!st.isEmpty()){
            minst=Math.min(minst,st.peekLast());
            st1.offerLast(st.peekLast());
            st.pollLast();
        }
          while(!st1.isEmpty()){
           
            st.offerLast(st1.peekLast());
            st1.pollLast();
        }
        return minst;
    }
}
