/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur = head;
        ListNode leftPrev = dummy;
        for(int i=1;i<left;i++){
            cur = cur.next;
            leftPrev = leftPrev.next;
        }
        ListNode prev = null;
        for(int i=1;i<=right-left+1;i++){
            ListNode temp = cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        leftPrev.next.next=cur;
        leftPrev.next=prev;
        return dummy.next;


    }
}