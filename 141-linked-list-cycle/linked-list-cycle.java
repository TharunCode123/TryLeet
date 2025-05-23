/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast  = head;
        while(slow!=null){
            if(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            else{
                return false;
            }
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}