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
    public void reorderList(ListNode head) {
        //Finding the mid
        ListNode slow = head , fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Spliting the list in two.
        ListNode second = slow.next;
        ListNode prev = slow.next = null;

        //Reversing the list
        while(second!=null){
           ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        //Merging the lists
        ListNode first=head;
        second = prev;
        while(second !=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
