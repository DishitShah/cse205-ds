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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)
         return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead; 
    }
    public ListNode findmiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head ==null || head.next == null){
            return true;
        }
        ListNode middle = findmiddle(head);
        ListNode secondHalfstart = reverse(middle.next);
        ListNode first = head;
        while(secondHalfstart != null){
            if(first.val != secondHalfstart.val)
            return false;
            first = first.next;
            secondHalfstart = secondHalfstart.next;
        }
        return true;
    }
}
