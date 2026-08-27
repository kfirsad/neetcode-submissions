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

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : map.keySet()){
            int numberOfTimes = map.get(key);
            if(buckets[numberOfTimes] == null){
                buckets[numberOfTimes] = new ArrayList<>();
            }
            buckets[numberOfTimes].add(key);
        }

        int[] finalList = new int[k];
            
        int index = 0;

        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != null){
                for(int key : buckets[i]){
                    finalList[index++] = key;
                    if(index == k){
                        return finalList;
                    }
                }
            }
        }

        return finalList;


    }
}
