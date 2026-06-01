/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class Solution {
    public bool HasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<ListNode>();

        ListNode temp = head;

        while(temp != null){
            bool test = seen.Add(temp);
            if(!test){
                return true;
            }

            temp = temp.next;

        }

        return false;
    }
}
