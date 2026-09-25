class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int x : stones){
            pq.add(x);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            
            if(second < first){
                second = first - second;
                pq.add(second);
            }
        }

        Integer last = pq.poll();
        if(last == null){
            return 0;
        }

        return last;
    }
}
