public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        Dictionary<int, int> seen = new Dictionary<int, int>();

        foreach(int x in nums){
            if(!seen.ContainsKey(x)){
                seen[x] = 1;
            }else{
                seen[x] ++;
            }
        }

        int[] result = seen.OrderByDescending(pair => pair.Value).Take(k).Select(pair => pair.Key).ToArray();
        return result;

    }
}
