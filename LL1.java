class LL {
    Node head;
    private int size;
    LL(){
        this.size =0;
    }
    
    class Node{
        String data;
        Node.next;
        Node(String data){
            this.data= data;
            this.next= null;

        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            size++
        }
    }
    public void addLast(String data){
        Node newNode =new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }
    public void printList(){
        Node currNode =head;
        while(currNode!=null){
            System.out.println(currNode.data+" ->");
            currNode = currNode.next;
        }
        Sysout.println("NULL");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;

        }
        size--;
        head =head.next;
    }
    public void deteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast =head;
        Node lastNode =head.next;
        while(lastNode.next!=null){
            lastNode =lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next =null;

    }
      public int getSize() {
        return size;
    }
    public void reverseIterate(){
        if(head ==null || head.next == null){
            rturn;
        }
        Node prevNode =head;
        Node currNode =head.next;
        while(currNode!=null){
            Node nextNode =currNode.next;
            currNode =prevNode;
            prevNode =nextNode;
            currNode =nextNode;

        }
        head.next =null;
        head =prevNode;

    }
    public Node reverseRecursive(Node head){
        if(head.next ==null || head ==null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next =head;
        head.next=null;


        return newHead;

    }
    public static void main(String[] args) {
        LL list =new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("Size of the list: " + list.getSize());
        list.printList();
        list.reverseIterate();  
        list.printList();
        list.head = list.reverseRecursive(list.head);
    }
  
    
}
