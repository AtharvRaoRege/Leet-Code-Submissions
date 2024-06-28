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
    public static int sizeOfLinkedList(ListNode head) {
        int size = 0;
        while(head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        1->2->3->4->5->6
        if(sizeOfLinkedList(head) < 2) return null;
        if(sizeOfLinkedList(head) == n) return head.next; 
        ListNode ptr = head;
        int size = sizeOfLinkedList(head);
        int pos = size - n; // pos - 6 - 2 = 4
        for(int i = 0; i < pos - 1; i++){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}