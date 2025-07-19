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
    public static void main(String[] args) {
        LL list =new LL();
        list.addFirst("Hello");
        list.addFirst("World");
        list.printList();
        list.addLast("!");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deteLast();    
        list.printList();
        System.out.println("Size of the list: " + list.getSize());
        
    }
  
    
}
