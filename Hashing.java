import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
public static void main(String[] args) {
    HashSet<Integer> set =new HashSet<>();
    //inserting
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1); 
    if(set.contains(1)){
        System.out.println("1 is present");
    }
    if(!set.contains(6)){
        System.out.println("6 is not present");
    }
    // removing
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("1 is not present after removal");
    }
    System.out.println(set.size() + " elements in the set");
    System.out.println(set);
    Iterator it =set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    
}
}
