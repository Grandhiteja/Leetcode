class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int element = 0;
        for(int i  = 0; i < n; i++){
            if(cnt == 0){
                cnt = 1;
                element = nums[i];
            }else if (element == nums[i]){
                cnt++;

            }else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element){
                cnt1++;
            }
        }
        if(cnt1 > (n/2)){
            return element;
        }
        return -1;
    }
}