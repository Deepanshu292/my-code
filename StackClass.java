
import java.util.List;

public class StackClass {
   static class Stack{
        ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return List.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int top =List.get()(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            return List.get(List.size()-1);

        }

    }

       public static void main(String args[]){
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
