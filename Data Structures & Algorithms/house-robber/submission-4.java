class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int prevPrevHouse = nums[0];
        int prevHouse = Math.max(prevPrevHouse, nums[1]);
        int maxProfit = Math.max(prevHouse, prevPrevHouse);

        for(int i = 2; i < nums.length; i++){
            maxProfit = Math.max(prevHouse, prevPrevHouse + nums[i]);
            prevPrevHouse = prevHouse;
            prevHouse = maxProfit;
        }

        return maxProfit;

    }
}
