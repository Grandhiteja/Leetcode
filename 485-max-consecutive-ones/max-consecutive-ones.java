class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // fun(list<int> names,k){
        //     long maxlen = 0;
        //     int l = 0,r = 0, zero = 0;
        //     while(r < nums.size()){
        //         if (nums[r] == 0) zero++;
        //         while (zero > k){
        //             if (nums[left] == 0) zero--;
        //             left++;
        //         }

        //     }if (zero <= k){
        //         len = r - l+1;
        //         maxlen = max(len,maxlen);
        //     }
        //     r++;
        // }
        // return
        int maxCount = 0,currentCount = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
                maxCount = Math.max(maxCount,currentCount);
            }else {
                currentCount = 0;
            }
        }
        return maxCount;
        
    }
}