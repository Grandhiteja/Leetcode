class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int [] re = new int[n];
       int l = 0,r = n-1, index = n-1;
            while(l <= r){
                int ls = nums[l]*nums[l];
                int rs = nums[r]*nums[r];
                if(ls > rs){
                    re[index] = ls;
                    l++;
                }else{
                    re[index] = rs;
                    r--;
                }
                index--;
            }
            return re;

        
        
    }
}