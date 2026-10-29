class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<n && j>=0 && (j-i+1)!=k){
            if(Math.abs(x-arr[i])>Math.abs(x-arr[j])){
               
                i++;
            }
            else{
               j--;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int p=i;p<=j;p++){
            ans.add(arr[p]);
        }
        return ans;
    }
}