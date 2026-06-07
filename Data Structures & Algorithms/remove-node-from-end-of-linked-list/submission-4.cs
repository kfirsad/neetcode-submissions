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
    public ListNode RemoveNthFromEnd(ListNode head, int n) {

        if(n <= 0){
            return null;
        }

        int length = 0;

        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        int toRemove = length - n;

        if(toRemove < 0){           
            return null;
        }
        
        if(toRemove == 0){
            return head.next;
        }

        ListNode newHead = head;
        temp = newHead;
        int index = 1;

        while(temp != null && index < toRemove){
            temp = temp.next;
            index++;
        }

        temp.next = temp.next.next;

        return newHead;

    }
}
