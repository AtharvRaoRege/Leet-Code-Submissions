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
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode p1 = odd;
        ListNode p2 = even;
        ListNode h = head;
        int i = 1;
        while(h != null) {
            if(i % 2 == 0) {
                p2.next = new ListNode(h.val);
                p2 = p2.next;
            } else {
                p1.next = new ListNode(h.val);
                p1 = p1.next;
            }
            i++;
            h = h.next;
        }
        p2.next = null;
        p1.next = even.next;
        return odd.next;
    }
}