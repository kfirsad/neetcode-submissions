/*
// Definition for a Node.
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int _val) {
        val = _val;
        next = null;
        random = null;
    }
}
*/

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Dictionary<Node, Node> map = new Dictionary<Node, Node>();
        Node temp = head;

        while (temp != null) {
            map[temp] = new Node(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.next != null) {
                map[temp].next = map[temp.next];
            }

            if (temp.random != null) {
                map[temp].random = map[temp.random];
            }

            temp = temp.next;
        }

        return map[head];
    }
}
