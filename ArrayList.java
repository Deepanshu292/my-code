import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(8);
        list.add(3);
        list.add(5);
        System.out.println(list);
        int element =list.get(0);
        list.set(1,60);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }


    
}
