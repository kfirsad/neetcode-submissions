class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int prevPrevHouse = nums[0];
        int prevHouse = Math.max(prevPrevHouse, nums[1]);
        int maxProfitRouteA = prevHouse;
        int maxProfitRouteB = nums[1];

        for (int i = 2; i < nums.length - 1; i++) {
            maxProfitRouteA = Math.max(prevHouse, prevPrevHouse + nums[i]);
            prevPrevHouse = prevHouse;
            prevHouse = maxProfitRouteA;
        }
            maxProfitRouteA = Math.max(prevHouse, prevPrevHouse);


        prevPrevHouse = nums[1];
        prevHouse = Math.max(prevPrevHouse, nums[2]);

        for (int i = 3; i < nums.length; i++) {
            maxProfitRouteB = Math.max(prevHouse, prevPrevHouse + nums[i]);
            prevPrevHouse = prevHouse;
            prevHouse = maxProfitRouteB;
        }

        maxProfitRouteB = Math.max(prevHouse, prevPrevHouse);

        return Math.max(maxProfitRouteA, maxProfitRouteB);
    }
}
