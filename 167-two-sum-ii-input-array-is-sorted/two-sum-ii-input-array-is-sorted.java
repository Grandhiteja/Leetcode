class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        //creating a array for value,orginal value
        int[][] numsWithIndex = new int[n][2];
        //store each element with its original index
        for(int i = 0; i < n; i++){
            numsWithIndex[i][0] = num[i];
            numsWithIndex[i][1] = i;

        }
        Arrays.sort(numsWithIndex,(a,b) -> Integer.compare(a[0],b[0]));
        int l = 0; int r = n - 1;
        while(l < r){
            int s = numsWithIndex[l][0] + numsWithIndex[r][0];
            if (s == target){
                return new int[]{numsWithIndex[l][1] + 1,numsWithIndex[r][1] + 1};

            }else if (s < target){
                l++;
            }else {
                r--;
            }
        }
        return new int[]{};

        
    }
}