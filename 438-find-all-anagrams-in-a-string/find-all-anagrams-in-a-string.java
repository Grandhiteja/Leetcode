class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);

        }
        int left = 0,count = p.length();
        for(int right = 0; right < s.length();right++){
            char ch = s.charAt(right);// right pointer read the characters
            int val = map.getOrDefault(ch,0);//read the values and count those values 
            if(val > 0) count--;//whenever the the same values are present more than onr=e time we need to decrease the count of that 
            map.put(ch,val - 1);//after decresing in the count we nned to decrease in freaquence 
            if(right - left + 1>p.length()){// when the length is greater than than the given string we need to shrink the left pointer and increase the count is the value was same or otherwise just decrease the frequence 
                char leftChar = s.charAt(left);
                int leftVal = map.getOrDefault(leftChar,0);// read the frequence of character 
                if (leftVal >= 0) count++;
                map.put(leftChar,leftVal + 1);
                left++;
            }
            if(count == 0){
                res.add(left);
            }
        }
        return res;
        
    }
}