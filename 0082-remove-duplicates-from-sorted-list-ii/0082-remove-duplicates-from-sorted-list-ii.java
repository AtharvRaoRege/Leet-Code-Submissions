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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode();
        curr = dummy;
        for(int i: list){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummy.next;
    }
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> hm = new HashMap<>();
        ListNode li = head;
        while(li != null){
            hm.put(li.val,hm.getOrDefault(li.val,0)+1);
            li = li.next;
        }
        ListNode dummy = new ListNode(0);
        li = head;
        ListNode li2 = dummy;
        while(li != null){
            if(hm.get(li.val) == 1){
                li2.next = new ListNode(li.val);
                li2 = li2.next;
                li = li.next;
            }else{
                li = li.next;
            }
        }
        return sortList(dummy.next);
    }
}