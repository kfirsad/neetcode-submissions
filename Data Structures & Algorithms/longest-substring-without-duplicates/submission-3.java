class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        char[] sArray = s.toCharArray();
        HashSet<Character> map = new HashSet<>();
        int longest = 0;
        
        while(right < sArray.length){
            if(!map.contains(sArray[right])){
                map.add(sArray[right]);
                longest = Math.max(longest, ((right - left) + 1));
                right++;               
            }else{
                map.remove(sArray[left]);
                left++;
            }
        }

        return longest;
    }
}
