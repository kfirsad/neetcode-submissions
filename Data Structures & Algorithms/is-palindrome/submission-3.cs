public class Solution {
    public bool IsPalindrome(string s) {
        int rightIndex = s.Length - 1;
        int leftIndex = 0;
        s = s.ToLower();

        while (leftIndex < rightIndex) {
            while ((leftIndex < rightIndex) && !Char.IsLetterOrDigit(s[leftIndex])) {
                    leftIndex++;                    
            }

            while ((leftIndex < rightIndex) && !Char.IsLetterOrDigit(s[rightIndex])) {
                    rightIndex--;                    
            }

            if (s[leftIndex] != s[rightIndex]) {
                return false;
            }

            rightIndex--;
            leftIndex++;
        }

        return true;
    }
}
