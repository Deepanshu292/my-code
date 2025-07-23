public class Solutions9 {
    public boolean hasCycle(ListNode head){
        if(head ==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                return true;

            }
        }
        return false;
    }
    public void removeCycle(ListNode head){
        if(head ==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                break;
            }
        }
        if(slow == null || fast == null){
            return; // No cycle found
        }

        slow = head; // Reset slow to the start
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        // Now 'slow' and 'fast' are at the start of the cycle
        // To remove the cycle, we need to find the last node in the cycle
        while(fast.next != slow){
            fast = fast.next;
        }
        fast.next = null; // Break the cycle
    }

    
}
