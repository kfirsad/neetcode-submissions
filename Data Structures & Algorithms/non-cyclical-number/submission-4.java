class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        while (n != 1 && !set.contains(n)) {
            sum = 0;
            set.add(n);
            int num = n;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
