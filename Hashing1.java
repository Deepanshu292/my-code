import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 100);
        map.put("USA", 200);
        map.put("China", 300);
        map.put("China", 890); // overwrites previous value

        System.out.println(map);

        // search
        if (map.containsKey("China")) {
            System.out.println("China is present with value: " + map.get("China"));
        } else {
            System.out.println("China is not present");
        } int arr[]={12,15,18};
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println(" " );
        for(Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        map.remove("China");
        Set<String> keys = map.keySet();
        for(String Key : keys){
            System.out.println(Key + " : " + map.get(Key));
        }


    //    / System.out.println(map.get("India"));
    }
}
