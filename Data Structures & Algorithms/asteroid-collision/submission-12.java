class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
           if(asteroids[i]>0){
            st.push(asteroids[i]);
           }
           else{
            while(!st.empty() && st.peek()>0 && Math.abs(asteroids[i])>Math.abs(st.peek())){
                st.pop();
            }
            if(!st.empty() && st.peek()>0 && Math.abs(asteroids[i])==Math.abs(st.peek()) ){
                st.pop();
            }
            else if(!st.empty() && st.peek()>0 && Math.abs(st.peek())>Math.abs(asteroids[i])) continue;
            else if(st.empty() || st.peek()<0){
                st.push(asteroids[i]);
            }
           }
           
            
        }
        int p=st.size();
        Stack<Integer> st2=new Stack<>();
        int[] arr=new int[p];
         while(!st.empty()){
            st2.push(st.peek());
            st.pop();
            
        }
        int i=0;
        while(!st2.empty()){
            arr[i]=st2.peek();
            st2.pop();
            i++;
        }
        return arr;
    }
}