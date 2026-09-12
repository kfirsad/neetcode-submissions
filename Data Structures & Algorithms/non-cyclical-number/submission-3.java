class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        while(n != 1){
            sum = 0;
            while(n > 0){
                sum+= (n % 10) * (n % 10);
                n /= 10;
            }

            if(!set.contains(sum)){
                set.add(sum);
            }else{
                return false;
            }

            n = sum;
        }

        return true;
    }
}
