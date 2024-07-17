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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode li = head;
        while(li != null && li.next != null){
            if(li.val != li.next.val) {
                li = li.next;
            }else{
                li.next = li.next.next;
            }
        }
        return head;
    }
}