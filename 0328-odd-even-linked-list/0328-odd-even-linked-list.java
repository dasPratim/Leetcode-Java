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
        if(head == null || head.next == null || head.next.next == null) 
            return head;
      
        
        ListNode currOdd = head;
        ListNode currEven = head.next;
        
        ListNode odd = currOdd;
        ListNode even = currEven;
        
        while(currEven != null && currEven.next != null){
            currOdd.next = currOdd.next.next;
            currOdd = currOdd.next;
            currEven.next = currEven.next.next;
            currEven = currEven.next;
        }

        
        currOdd.next = even;
        return odd;
    }
}