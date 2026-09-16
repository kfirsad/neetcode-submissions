class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int totalCost = 0;
        int prev1 = cost[1];
        int prev2 = cost[0];

        for(int i = 2; i < cost.length; i++){
            totalCost = Math.min(prev1, prev2) + cost[i];
            prev2 = prev1;
            prev1 = totalCost;
        }

        totalCost = Math.min(prev1, prev2);
        return totalCost;

    }
}
