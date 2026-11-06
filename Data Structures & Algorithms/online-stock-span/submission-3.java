class StockSpanner {

    public StockSpanner() {
        
    }
    Stack<Integer>st=new Stack<>();
    Stack<Integer>st2=new Stack<>();
  int x=Integer.MAX_VALUE;
    public int next(int price) {
        int cnt=1;
     
        while(!st.empty() && st.peek()<=price){
            cnt++;
           int x= st.pop();
           st2.push(x);
           
        }
        while(!st2.empty()){
            st.push(st2.peek());
            st2.pop();
        }
        st.push(price);
        
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */