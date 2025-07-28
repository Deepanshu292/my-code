import java.util.*;
public class Classroom1 {
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }

    public static void main(String args[]){
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={6,7,8,9,10};
        System.out.println("Union of two arrays: " + union(arr1, arr2));
    }
    
}
