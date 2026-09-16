class Solution {
    public int climbStairs(int n) {
        int prevStair1 = 2;
        int prevStair2 = 1;

        if(n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }

        int numberOfWays = 0;

        for(int i = 3; i <= n; i++){
            numberOfWays = prevStair1 + prevStair2;
            prevStair2 = prevStair1;
            prevStair1 = numberOfWays;
        }

        return numberOfWays;
    }
}
