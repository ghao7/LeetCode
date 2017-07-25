import java.util.Stack;

/**
 * Created by guhao on 7/24/17.
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        if (fast == null || fast.next == null){
            return true;
        }

        stack.push(slow);
        while (fast.next != null && fast.next.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow);
        }

        if (fast.next != null){
            slow = slow.next;
        }

        ListNode cur = slow;

        while (cur != null){
            if (cur.val != stack.pop().val) return false;
            cur = cur.next;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


