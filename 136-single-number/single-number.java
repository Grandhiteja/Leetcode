class Solution {
    public int singleNumber(int[] arr) {
        int xorr = 0;
        for(int nums: arr){
            xorr ^= nums;
        }
        return xorr;
        
    }
}