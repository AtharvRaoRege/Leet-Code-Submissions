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
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int carry = 0;
        ListNode list1 = l1;
        ListNode list2 = l2;
        while(list1 != null || list2 != null){
            int sum = carry;
            if(list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            if(list2 != null){
                sum += list2.val;
                list2 = list2.next;
            }
            
            carry = sum/10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry == 1) temp.next = new ListNode(1);
        return res.next;
    }
}