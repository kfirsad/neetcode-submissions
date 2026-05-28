public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.Length];
        leftProducts[0] = 1;
        int[] rightProducts = new int[nums.Length];
        rightProducts[nums.Length - 1] = 1;

        int[] finalSums = new int[nums.Length];

        for(int i = 1; i < nums.Length; i++){
        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        for(int i = nums.Length - 2; i >= 0; i--){
        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < nums.Length; i++){
        finalSums[i] = leftProducts[i] * rightProducts[i];
        }

        return finalSums;
    
    }
}