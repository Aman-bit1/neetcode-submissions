class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int maxL=Integer.MIN_VALUE;
        while(i<=j){
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            int area=width*height;
             maxL=Math.max(maxL,area);
             if(heights[i]<heights[j]) i++;
             else j--;
        }
        return maxL;
    }
}
