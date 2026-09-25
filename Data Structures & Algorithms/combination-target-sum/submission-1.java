class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {       
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums, 0, target);
        return result;
    }

    public void backTrack(List<List<Integer>> result, List<Integer> curr, int[] nums, int start, int target){
        if(target < 0){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);
            backTrack(result, curr, nums, i, target - nums[i]);
            curr.remove(curr.size() - 1);
        }
    }
}
