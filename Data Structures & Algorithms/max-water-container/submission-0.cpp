class Solution {
public:
    int maxArea(vector<int>& heights) {
        int n = heights.size();
        int i=0;
        int j=n-1;
        int maxArea=0;
        
        while(i<j){
         int width=j-i;
         int h = min(heights[i],heights[j]);
         int area = width*h;
         maxArea=max(maxArea,area);
         if(heights[i]>heights[j]) j--;
         else i++;

        }
        return maxArea;
    }
};
