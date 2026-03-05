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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null || head.next == null){
            if(n >= 1){
               head = null;
               return head; 
            }
        }

        ListNode temp = head;
        int k = 0;

        while(temp!=null){
            k++;
            temp = temp.next;
        }

        int pos = k - n;

        if(pos == 0){
           
            return head.next;
        }

        temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        delNode.next = null; 

        return head;
    }
}