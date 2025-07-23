
import java.util.List;

public class Solution88 {
    public ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode curr =head;
        while(curr !=null){
            ListNode.next=curr.next
            curr.next =prev;
            //update
            prev =curr;
            curr =next;

     }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow =head;
        ListNode fast =head;
        while(fast !=null && fast.next !=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle =findMiddle(head);
        ListNode secondhalfStart =reverse(middle.next);
        ListNode firsthalfStart =head;
        while(secondhalfStart != null){
            if(firsthalfStart.val !=secondhalfStart.val){
                return false;
            }
            firsthalfStart =firsthalfStart.next;
            secondhalfStart =secondhalfStart.next;
        }
        return true;



    }
    
}
