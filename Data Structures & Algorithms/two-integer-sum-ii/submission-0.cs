public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.Length - 1;

        while(leftIndex < rightIndex){
            int currentSum = numbers[leftIndex] + numbers[rightIndex];

            if(currentSum == target){
                return new int[] { leftIndex + 1, rightIndex + 1 };
            }else if(currentSum < target){
                leftIndex++;
            }else{
                rightIndex--;
            }
        }

        return new int[0];

    }
}