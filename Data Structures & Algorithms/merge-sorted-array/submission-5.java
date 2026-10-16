class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=nums1.length;
       int j=0;
       int cnt=0;
       for(int i=0;i<x;i++){
        if(nums1[i]==0 && j<n){
           nums1[i]= nums2[j];
           
           j++;
        }
       } 
       Arrays.sort(nums1);
    }
}