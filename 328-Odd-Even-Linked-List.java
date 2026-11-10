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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode OddHead = head;
        ListNode OddTail = head;
        ListNode EvenHead = head.next;
        ListNode EvenTail = head.next;
        while(EvenTail != null && EvenTail.next != null){
            OddTail.next = EvenTail.next;
            OddTail = OddTail.next;

            EvenTail.next = OddTail.next;
            EvenTail = EvenTail.next;
        }
        OddTail.next = EvenHead;
        return OddHead;
    }
}