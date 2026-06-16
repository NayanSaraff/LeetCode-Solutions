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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode temp = head;

        if(temp1 == null)
            return temp2;
        if(temp2 == null)
            return temp1;

        int carry = 0;
        while(temp1!=null || temp2!=null)
        {

            int x = (temp1!=null)?temp1.val:0;
            int y = (temp2!=null)?temp2.val:0;

            int sum = x + y + carry;

            temp.next = new ListNode(sum % 10);

            if(sum > 9)
            {
                carry = sum / 10;
            }
            else
            {
                carry = 0;
            }

            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null)  temp2 = temp2.next;
            temp = temp.next;  
        }
        if(carry > 0)
            temp.next = new ListNode(carry);

        return head.next;
    }
}
