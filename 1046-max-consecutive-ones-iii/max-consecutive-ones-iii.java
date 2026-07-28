class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0,maxlen = 0,zero = 0;
        for(int r = 0; r <n; r++){
            if(nums[r] ==0){
                zero++;
            }if(zero > k){
                if(nums[l] == 0){
                    zero--;
                    //l++;
                }
                l++;
            }
            if(zero <= k){
                
                maxlen = Math.max(r-l+1,maxlen);
            }
            //r++;
            //maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
        //maxlen = Math.max(maxlen,r-l+1);


    }
}