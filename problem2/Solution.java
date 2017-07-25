/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode root = new ListNode(0);
        ListNode result = root;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int temp;
            if (l1 == null){
                temp = l2.val + result.val;
            }else if (l2 == null){
                temp = l1.val + result.val;
            }else{
                temp = l1.val + l2.val + result.val;
            }
            carry = temp/10;
            result.val = temp%10;
            if (l1 == null){
                l2 = l2.next;
            }else if (l2 == null){
                l1 = l1.next;
            }else{
                l1 = l1.next;
                l2 = l2.next;

            }
            if ( l1 != null || l2 != null || carry == 1 ){
                result.next = carry == 1?new ListNode(1):new ListNode(0);
                result = result.next;
            }
        }
        return root;
    }
}
