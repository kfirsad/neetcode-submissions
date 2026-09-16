class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sArray = s.toCharArray();
        int longest = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();

        while(right < sArray.length){
            if(!set.contains(sArray[right])){
                set.add(sArray[right]);
                longest = Math.max(longest, right - left + 1);
                right++;
            }else{
                set.remove(sArray[left]);
                left++;
            }
        }

        return longest;
    }
}