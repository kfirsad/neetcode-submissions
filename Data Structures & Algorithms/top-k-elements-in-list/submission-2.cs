public class Solution {
public int[] TopKFrequent(int[] nums, int k) {
    Dictionary<int, int> seen = new Dictionary<int, int>();
    foreach(int x in nums) {
        if(!seen.ContainsKey(x)) seen[x] = 0;
        seen[x]++;
    }

    List<int>[] bucket = new List<int>[nums.Length + 1];
    
    foreach(var pair in seen) {
        int freq = pair.Value;
        if(bucket[freq] == null) {
            bucket[freq] = new List<int>();
        }
        bucket[freq].Add(pair.Key);
    }

    List<int> resultList = new List<int>();
    for(int i = bucket.Length - 1; i >= 0 && resultList.Count < k; i--) {
        if(bucket[i] != null) {
            resultList.AddRange(bucket[i]);
        }
    }

    return resultList.Take(k).ToArray(); 
}
}
