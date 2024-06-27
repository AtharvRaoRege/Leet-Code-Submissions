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
    public static boolean isPalindrome(ListNode head) {
        ListNode pall = new ListNode(0);
        ListNode pal = pall;
        ListNode temp = head;

//      copy linked list

        while(temp != null){
            
            pal.next = new ListNode(temp.val);
            temp = temp.next;
            pal = pal.next;
        }
        pal = pall.next;

//      reverse linked list

        ListNode curr = head;
        ListNode prev = null;
        ListNode front = null;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        curr = prev;

        while(curr != null){
            
            
            if(curr.val != pal.val) return false;
            curr = curr.next;
            pal = pal.next;
        }
        System.out.println("hell");
        return true;
    }
}