class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0,r = n-1;
        int maxArea = 0;
        //it travel upto reach those elements to calculate the length of the pool then the time complexity willl bw=e the "o(n)""
        while(l <= r){
            //compare the both heights from left and right then thake the lower height one and save it in width
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            int area = h*w;
            maxArea = Math.max(maxArea,area);
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }

        }
        return maxArea;

        
    }
}