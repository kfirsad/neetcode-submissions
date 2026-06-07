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
    public ListNode MergeKLists(ListNode[] lists) {
        List<int> resultList = new List<int>();
        foreach(ListNode head in lists){
            ListNode current = head;
            while(current != null){
                resultList.Add(current.val);
                current = current.next;
            }
        }

        resultList.Sort();

        ListNode dummy = new ListNode(0);
        ListNode newCurrent = dummy;

        foreach(int num in resultList){
            newCurrent.next = new ListNode(num);
            newCurrent = newCurrent.next;
        }

        return dummy.next;

    }
}
