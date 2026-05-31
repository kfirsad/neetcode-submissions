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
    public ListNode ReverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        
        Stack<ListNode> stack = new Stack<ListNode>();

        while(head != null){
         stack.Push(head);
         head = head.next;   
        }

        ListNode newHead = stack.Pop();
        ListNode current = newHead;

        while(stack.Count > 0){
            current.next = stack.Pop();
            current = current.next;
        }

        current.next = null;

        return newHead;

    }
}
