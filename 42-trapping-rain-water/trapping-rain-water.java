class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0,r=n-1,water = 0;
        int l_max = height[l],r_max=height[r];
        while(l < r){
            if(l_max < r_max){
                l+=1;
                l_max = Math.max(l_max,height[l]);
                water += l_max-height[l];
            }else{
                r--;
                r_max = Math.max(r_max,height[r]);
                water += r_max-height[r];

            }
        }
        return water;
        
        
    }
}