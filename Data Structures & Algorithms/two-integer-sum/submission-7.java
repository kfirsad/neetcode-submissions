class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int[] answer = null;
        for (int x : nums) {
            if (!map.containsKey(target - x)) {
                map.put(x, index);
            }else{
                                    answer = new int[] {map.get(target - x), index};
                                        return answer;

            }
                    index++;

        }
            if(answer == null){
        return new int[]{0,0};
    }
    return answer;
    }

}

