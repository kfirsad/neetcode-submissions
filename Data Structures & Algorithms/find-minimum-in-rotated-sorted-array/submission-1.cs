public class Solution {
    public int FindMin(int[] nums) {
        int mid = 0;
        int right = nums.Length - 1;
        int left = 0;

        while(left < right){
            mid = left + (right - left) / 2 ;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

}
