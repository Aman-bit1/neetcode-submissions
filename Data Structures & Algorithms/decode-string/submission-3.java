class Solution {
    public String decodeString(String s) {
        Stack<Character>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        int n=s.length();
        int number=0;
        for(int i=0;i<n;i++){
            
          
            if(Character.isDigit(s.charAt(i))){
                 number= (number*10)+(s.charAt(i)-'0');
               
            }
            else if(s.charAt(i)=='['){
                st2.push(number);
                number=0;
                st1.push(s.charAt(i));
            }
            else if(s.charAt(i)==']'){
                String ss="";
                while(st1.peek()!='['){
                    ss+=st1.peek();
                    st1.pop();
                }
                st1.pop();
                StringBuilder sb=new StringBuilder(ss);
                sb.reverse();
                String sss="";
                int repeat=st2.peek();
                st2.pop();
                for(int j=0;j<repeat;j++){
                    sss+=sb;
                }
                for(int k=0;k<sss.length();k++){
                    st1.push(sss.charAt(k));
                }
                
            }
            else{
                st1.push(s.charAt(i));
            }
            

        }
       String str="";
       while(!st1.empty()){
        str+=st1.peek();
        st1.pop();
       }
        StringBuilder sbr=new StringBuilder(str);
                sbr.reverse();
            String xxx=sbr.toString();
       return xxx;
    }
}