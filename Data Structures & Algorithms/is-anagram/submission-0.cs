public class Solution {
    public bool IsAnagram(string s, string t) {

    if(s.Length != t.Length){
        return false;
    }

    int[] charCountes = new int[26];

    for(int i = 0; i < s.Length; i++){
        charCountes[s[i] - 'a']++;
        charCountes[t[i] - 'a']--;
    }

    for(int i = 0; i < charCountes.Length; i++){
        if(charCountes[i] != 0){
            return false;
        }
    }

    return true;
}
}
