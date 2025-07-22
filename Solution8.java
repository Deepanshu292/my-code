class Solution8 {
    public ListNode removeNthfromEnd(ListNode head ,int n){
        if(head.next == null){
            return null;
        }
        int size =0;
        ListNode curr =head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch = size-n;
        ListNode prev =head;
        int i=1;
        while(i<indexToSearch){
            prev =prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return head;
    }
    
}
