class LL {
    Node head;
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
    public static void main(String[] args) {
        LL list =new LL();
        list.addFirst("Hello");
        list.addFirst("World");
        list.printList();
        list.addLast("!");
        list.printList();
        
    }
    
}
