public class Solution {
    public string MinWindow(string s, string t) {
        int right = 0;
        int left = 0;
        int matched = 0;
        int minLength = int.MaxValue;
        int minStart = 0;
        Dictionary<char, int> seen = new Dictionary<char, int>();

        foreach(char c in t){
            if(seen.ContainsKey(c)){
                seen[c]++;
            }else{
            seen.Add(c,1);
            }
        }

        int required = seen.Count;

        while(right < s.Length && left < s.Length){
            if(seen.ContainsKey(s[right])){
                seen[s[right]]--;
                
                if(seen[s[right]] == 0){
                    matched++;
                }
            }
            while(matched == required){
                if(right - left + 1 < minLength){
                    minLength = right - left + 1;
                    minStart = left;
                }

                if(seen.ContainsKey(s[left])){
                    seen[s[left]]++;
                    if(seen[s[left]] > 0){
                    matched--;
                    }
                }
                left++;
            }

            right++;

        }

        if(minLength != int.MaxValue){
        return s.Substring(minStart, minLength);

        }else{
            return "";
        }

    }
}
