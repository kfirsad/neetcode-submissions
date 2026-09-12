class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) +1);
            }else{
                map.put(x, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int key : map.keySet()){
            pq.add(key);
            while(pq.size() > k){
                pq.poll();
            }
        }

        int[] finalAnswer = new int[k];
        for(int i = 0; i < k; i++){
            finalAnswer[i] = pq.poll();
        }

        return finalAnswer;
    }
}
