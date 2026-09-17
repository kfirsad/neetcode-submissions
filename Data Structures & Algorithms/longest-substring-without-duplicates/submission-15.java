class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int longest = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1);
                right++;
            } else {
                while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                }

            }
        }

        return longest;
    }
}
