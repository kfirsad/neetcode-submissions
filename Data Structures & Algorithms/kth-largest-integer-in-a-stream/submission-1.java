class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
    int kNum = 0;

    public KthLargest(int k, int[] nums) {
        kNum = k;
        for(int x : nums){
            pq.add(x);
            while(pq.size() > kNum){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size() > kNum){
            pq.poll();
        }

        return pq.peek();
    }
}
