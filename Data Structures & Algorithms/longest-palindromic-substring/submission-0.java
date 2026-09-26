class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            int currMax = Math.max(maxLength(s, i, i), maxLength(s, i, i+1));
            if(currMax > maxLen){
                maxLen = currMax;
                start = i - (currMax - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);

    }

    public int maxLength(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return (right - 1) - left;
    }
}