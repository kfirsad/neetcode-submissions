class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for(int x : nums){
            int currListSize = list.size();
            for(int i = 0; i < currListSize; i++){
                List<Integer> newList = new ArrayList<>(list.get(i));
                newList.add(x);
                list.add(newList);
            }
        }

        return list;
    }
}
