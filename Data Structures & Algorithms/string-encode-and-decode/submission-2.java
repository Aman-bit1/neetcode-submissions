class Solution {

    public String encode(List<String> strs) {
      String s="";
      for(String it:strs){
        s+=String.valueOf(it.length()+"#"+it);
      }
      return s;
    }

    public List<String> decode(String str) {
     ArrayList<String>stri=new ArrayList<>();
     int i=0;
     while(i<str.length()){
        int j=i;
        while(str.charAt(j) != '#'){
            j++;
        }
        int len=Integer.parseInt(str.substring(i,i+(j-i)));
        String word=str.substring(j+1,j+1+len);
        stri.add(word);
        i=j+1+len;
     }
     return stri;
    }
}
