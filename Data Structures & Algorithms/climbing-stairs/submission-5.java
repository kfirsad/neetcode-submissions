class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }

        int oneStepBack = 2;
        int twoStepsBack = 1;
        int curr = 0;

        for(int i = 3; i <= n; i++){
            curr = oneStepBack + twoStepsBack;
            twoStepsBack = oneStepBack;
            oneStepBack = curr;
        }

        return curr;
    }
}