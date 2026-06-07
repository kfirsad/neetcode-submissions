public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int right = 0;
        int left = 0;
        int biggestSub = 0;

        HashSet<char> seen = new HashSet<char>();

        while(right < s.Length && left < s.Length){
            if(!seen.Contains(s[right])){
                seen.Add(s[right]);
                if(right-left + 1 > biggestSub){
                    biggestSub = right-left + 1;
                }
                right++;
            }else{
                seen.Remove(s[left]);
                left++;

            }

        }

        return biggestSub;

    }
}
