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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode list = list3;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                list.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                list.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            list = list.next;
        }

        while(l1 != null){
            list.next = new ListNode(l1.val);
            l1 = l1.next;
            list = list.next;
        }
        while(l2 != null){
            list.next = new ListNode(l2.val);
            l2 = l2.next;
            list = list.next;
        }
        return list3.next;
    }
}