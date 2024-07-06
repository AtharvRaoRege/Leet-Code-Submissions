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
public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode front = null;
        while(curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
    public static ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid = mid(head);
        ListNode hf = head;
        ListNode hs = reverse(mid);
        while(hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null) hf.next = null;
    }
}