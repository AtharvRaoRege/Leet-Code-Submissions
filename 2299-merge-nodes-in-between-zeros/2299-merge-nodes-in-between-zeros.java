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
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr = head.next;
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        while(ptr != null) {
            int sum = 0;
            while(ptr.val != 0){
                sum += ptr.val;
                ptr = ptr.next;
            }
            ptr = ptr.next;
            t.next = new ListNode(sum);
            t = t.next;
        }
        return dummy.next;
    }
}