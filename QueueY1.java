public class QueueY1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head =null;
        static Node tail =null;
        public static boolean isfull(){
            return head == null && tail == null;
        }
        //enqueue
        public static void add(int data){
            Node newNode =new Node(data);
            if(tail== null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            }
            //dequeue
        public static int remove(){
            if(isfull()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if(head == tail){
                tail = null; // If the queue becomes empty, reset tail
            }
            return front;
            //peek
        public static int peek(){

            if(isfull()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

           

        



    }
     public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
        q.remove(); // Testing remove on empty queue

    }

    
}
