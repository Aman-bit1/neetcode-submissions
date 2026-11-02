class MyQueue {

    public MyQueue() {
        
    }
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
       int y= st2.pop();
         while(!st2.empty()){
            st1.push(st2.peek());
            st2.pop();
        }
      return y;
    }
    
    public int peek() {
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
        int y=st2.peek();
         while(!st2.empty()){
            st1.push(st2.peek());
            st2.pop();
        }
      return y;
    }
    
    public boolean empty() {
        if(!st1.empty()) return false;
        else return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */