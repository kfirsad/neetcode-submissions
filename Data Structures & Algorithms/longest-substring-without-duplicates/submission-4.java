class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longestSubstring = 0;
        char[] sArray = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        while (right < sArray.length) {
            if (!set.contains(sArray[right])) {
                set.add(sArray[right]);
                longestSubstring = Math.max(longestSubstring, (right - left) + 1);
                right++;
            } else {
                set.remove(sArray[left]);
                left++;
            }
        }

        return longestSubstring;
    }
}
