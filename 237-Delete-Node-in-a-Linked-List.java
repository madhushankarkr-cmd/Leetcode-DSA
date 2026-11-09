/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next==null){
            node = null;
            return;
        }
        ListNode temp = node;
        temp.val = temp.next.val;
        temp.next=temp.next.next;
    
    }
    
}