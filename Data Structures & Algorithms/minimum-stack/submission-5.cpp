class MinStack {
public:
    stack<int>st,stmin;
     int minl=INT_MAX;
    MinStack() {
        
    }
   
    void push(int val) {
        minl=min(minl,val);
        stmin.push(minl);
        st.push(val);
    }
    
    void pop() {
        stmin.pop();
        if(!stmin.empty()){
               minl=stmin.top();
        }else{
            minl=INT_MAX;
        }
      
        st.pop();
       
    }
    
    int top() {
       return st.top();
    }
    
    int getMin() {
        // stack<int>st2;
        // int minl=INT_MAX;
        // while(!st.empty()){
        //     int x=st.top();
        //     minl=min(minl,x);
        //     st2.push(st.top());
        //     st.pop();
        // }
        //  while(!st2.empty()){
        //     st.push(st2.top());
        //     st2.pop();
        // }
        // return minl;
        return stmin.top();
    }
    
};
