class Solution {
    boolean isPal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        int cnt=0;
        while(i<j){
         if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
         }
         else{
            return isPal(s,i+1,j) || isPal(s,i,j-1);
         }
       
        }
       return true;

    }
}