public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] temp = nums;
        int[] sumArray = new int[nums.Length];

        for(int i = 0; i < nums.Length; i++){
            int curr = nums[i];
            nums[i] = 1;

            sumArray[i] = temp.Aggregate((acc, x) => acc * x);

            nums[i] = curr;
        }
        
        return sumArray;

}
}