public class Solution {
    public int LongestConsecutive(int[] nums) {
        HashSet<int> seen = new HashSet<int>();

        int biggestConsecutive = 0;
        
        foreach(int x in nums){
            seen.Add(x);
        }

        foreach(int x in nums){
            if(!seen.Contains(x - 1)){
                int currIndex = 1;
                while(seen.Contains(x + currIndex)){
                    currIndex++;
                }
                if(currIndex > biggestConsecutive){
                    biggestConsecutive = currIndex;
                }
            }   
        }

        return biggestConsecutive;

    }
}
