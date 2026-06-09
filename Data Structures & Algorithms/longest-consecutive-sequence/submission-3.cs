public class Solution {
    public int LongestConsecutive(int[] nums) {
        HashSet<int> seen = new HashSet<int>(nums);

        int longestStreak = 0;
        foreach(int n in seen){
            if(!seen.Contains(n - 1)){
                int currentNum = n;
                int currentStreak = 1;

                while(seen.Contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.Max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
