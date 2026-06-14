public class LRUCache {

    public class Node{
        public int key;
        public int val;
        public Node next;
        public Node prev;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    public int _capacity;
    private Dictionary<int,Node> _cache;

    private Node _head;
    private Node _tail;

    public LRUCache(int capacity) {
        _capacity = capacity;
        _cache = new Dictionary<int,Node>();

        _head = new Node(0,0);
        _tail = new Node(0,0);

        _head.next = _tail;
        _tail.prev = _head;
    }
    
    public int Get(int key) {
        if(_cache.ContainsKey(key)){
            Node node = _cache[key];
            
            removeNode(node);
            putNodeFirst(node);

            return node.val;
        }

        return -1;
    }
    
    public void Put(int key, int value) {
        if(_cache.ContainsKey(key)){
            Node node = _cache[key];
            node.val = value;

            removeNode(node);
            putNodeFirst(node);
        }else{
            if(_cache.Count == _capacity){
                Node lruNode = _tail.prev;
                _cache.Remove(lruNode.key);
                removeNode(lruNode);
            }

            Node newNode = new Node(key,value);
            _cache.Add(key,newNode);
            putNodeFirst(newNode);
        }
    }

    public void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void putNodeFirst(Node node){
        node.prev = _head;
        node.next = _head.next;
        _head.next.prev = node;
        _head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.Get(key);
 * obj.Put(key,value);
 */