public class Solution {
    public List<List<int>> ThreeSum(int[] nums) {
        List<List<int>> final = new List<List<int>>();
        Array.Sort(nums);

        for (int i = 0; i < nums.Length; i++) {         
            int x = nums[i];

            if(i > 0 && x == nums[i-1]){
                continue;
            }

            int rightIndex = nums.Length - 1;
            int leftIndex = i + 1;

            while (leftIndex < rightIndex) {
                int sum = x + nums[leftIndex] + nums[rightIndex];
                if (sum < 0) {
                    leftIndex++;
                }else if (sum > 0) {
                    rightIndex--;
                }else{
                    final.Add(new List<int> { x, nums[leftIndex], nums[rightIndex] });

                    while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex + 1]) {
                        leftIndex++;
                    }
                    while (leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex - 1]) {
                        rightIndex--;
                    }

                    rightIndex--;
                    leftIndex++;
                }
            }
        }

        return final;
    }
}
