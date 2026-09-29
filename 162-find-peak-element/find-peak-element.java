class Solution {
    public int findPeakElement(int[] nums) {// for searching in right side;
        int left = 0,right = nums.length-1;
        while(left < right){
            int mid = left + (right - left + 1)/2;
            if(nums[mid] > nums[mid-1]){
                left = mid;
            }else{
                right  = mid -1;
            }


        }
        return left;

        
    }
}