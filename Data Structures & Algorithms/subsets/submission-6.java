class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> curr, int[] nums, int start) {
        list.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);

            backTrack(list, curr, nums, i + 1);

            curr.remove(curr.size() - 1);
        }
    }
}
