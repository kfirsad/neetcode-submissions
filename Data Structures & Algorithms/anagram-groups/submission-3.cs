public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        
        Dictionary<string, List<string>> groups = new Dictionary<string, List<string>>();

        foreach(string text in strs){
            char[] charArray = text.ToCharArray();
            Array.Sort(charArray);
            string sortedText = new string(charArray);

            if(!groups.ContainsKey(sortedText)){
                groups[sortedText] = new List<string>();
            }

            groups[sortedText].Add(text);
        }

        return new List<List<string>>(groups.Values);

    }


}
