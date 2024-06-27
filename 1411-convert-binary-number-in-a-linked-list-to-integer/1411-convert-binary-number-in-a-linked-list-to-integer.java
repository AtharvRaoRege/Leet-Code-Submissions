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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        String num = sb.toString();
        int sum = 0;
        int j = 0;
        for(int i = num.length() - 1; i > -1; i--){
            sum += Integer.valueOf(String.valueOf(num.charAt(i))) * Math.pow(2,j++);
        }
        System.out.print(num);
        return sum;
    }
}