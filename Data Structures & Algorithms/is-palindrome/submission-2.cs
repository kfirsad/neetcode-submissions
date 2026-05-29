public class Solution {
    public bool IsPalindrome(string s) {
        int rightIndex = s.Length - 1;
        int leftIndex = 0;
        s = s.ToLower();

        while (leftIndex < rightIndex) {
            while (!Char.IsLetterOrDigit(s[leftIndex]) && (leftIndex < rightIndex)) {
                    leftIndex++;                    
            }

            while (!Char.IsLetterOrDigit(s[rightIndex]) && (leftIndex < rightIndex)) {
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
