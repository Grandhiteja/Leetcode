class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0,maxLen = 0;
        for(int right = 0; right < s.length();right++){
            char ch = s.charAt(right);//read the characters present in the map
            if(map.containsKey(ch)){
                //if the characters are repeted
                left = Math.max(left,map.get(ch)+1);//when the characters are repeted the left pointer movie to the the character which ahed 
            }
             map.put(ch,right);//when the new character was there it added to map
             maxLen = Math.max(maxLen,right-left + 1);//for finding the length of the substring before the right pointer before when the duplicate arrives 
        }
        return maxLen;

        
    }
}