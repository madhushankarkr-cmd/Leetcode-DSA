import java.util.Arrays;

class Solution {
    public ListNode sortList(ListNode head) {

        ListNode temp = head;
        int cnt = 0;

       
        while(temp != null) {
            cnt++;
            temp = temp.next;
        }

       
        int arr[] = new int[cnt];

        temp = head;
        int i = 0;

        while(i < cnt && temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }

        // Sort array
        Arrays.sort(arr);

    
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int j = 0; j < cnt; j++) {
            ListNode newnode = new ListNode(arr[j]);

            curr.next = newnode;
            curr = curr.next;
        }

        return dummy.next;
    }
}