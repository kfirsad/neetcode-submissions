public class Solution {
    public int CharacterReplacement(string s, int k) {
        int[] charCounts = new int[26];
        int right = 0;
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        while (right < s.Length && left < s.Length) {
            charCounts[s[right] - 'A']++;
            maxFreq = Math.Max(maxFreq, charCounts[s[right] - 'A']);

            bool isWindowValid = (right - left + 1) - maxFreq <= k;

            if (!isWindowValid) {
                charCounts[s[left] - 'A']--;
                left++;
            }
            maxLength = Math.Max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
