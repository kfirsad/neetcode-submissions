class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
        }

        List<Integer>[] numbersSortedByFrequency = new List[nums.length + 1];

        for(int x : map.keySet()){
            if(numbersSortedByFrequency[map.get(x)] == null){
                numbersSortedByFrequency[map.get(x)] = new ArrayList<>();
            }
            numbersSortedByFrequency[map.get(x)].add(x);
        }

        int index = 0;
        int[] finalAnswer = new int[k];
        for(int i = numbersSortedByFrequency.length - 1; i >= 0; i--){
            if(numbersSortedByFrequency[i] != null){
                for (int x : numbersSortedByFrequency[i]){
                    finalAnswer[index++] = x;
                    if(index == k){
                        return finalAnswer;
                    }
                }
            }
        }

        return finalAnswer;

    }
}
