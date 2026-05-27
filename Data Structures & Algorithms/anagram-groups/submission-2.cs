public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        
        Dictionary<string, List<string>> groups = new Dictionary<string, List<string>>();

        foreach(string text in strs){
            int[] count = new int[26];
            foreach (char c in text) {
                count[c - 'a']++;
            }

            string key = string.Join(",", count);

            if (!groups.TryGetValue(key, out var list)) {
                list = new List<string>();
                groups[key] = list;
            }
            list.Add(text);
        }

        return new List<List<string>>(groups.Values);

    }


}
