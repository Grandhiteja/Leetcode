class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0,r=0,k=0;
        for(r = 1; r <nums.length;r++){
            if(nums[r] != nums[l]){
                l++;
                nums[l] = nums[r];
            }
        }
        return l + 1;
    }
}