public class Solution {
    public bool IsPalindrome(string s) {
        s = new string(s.Where(char.IsLetterOrDigit).ToArray());
        s = s.ToLower();
        char[] charArray = s.ToCharArray();
        Array.Reverse(charArray);     
        string reversed = new string(charArray);

        if(s == reversed){
            return true;
        }

        return false;

    }
}
