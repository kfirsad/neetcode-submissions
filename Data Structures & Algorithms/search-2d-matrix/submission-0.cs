public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.Length; i++){
            bool test = BinarySearch(matrix[i], target);
            if(test){
                return true;
            }
        }
        
        return false;
    }

    public bool BinarySearch(int[] nums, int target) {
    int right = nums.Length - 1;
    int left = 0;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return true;
        }

        if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return false;
}
}
