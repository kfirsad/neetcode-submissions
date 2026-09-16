class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int maxRouteA = checkMaxPrice(nums, 0, nums.length -1);
        int maxRouteB = checkMaxPrice(nums, 1, nums.length);
        return Math.max(maxRouteA, maxRouteB);
    }

    public int checkMaxPrice(int[] nums, int startIndex, int endIndex){
        int prevPrevHouse = nums[startIndex];
        int prevHouse = Math.max(prevPrevHouse, nums[startIndex + 1]);
        int maxProfit = prevHouse;

        for (int i = startIndex + 2; i < endIndex; i++) {
            maxProfit = Math.max(prevHouse, prevPrevHouse + nums[i]);
            prevPrevHouse = prevHouse;
            prevHouse = maxProfit;
        }

        return maxProfit;
    }
}
