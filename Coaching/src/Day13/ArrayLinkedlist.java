package Day13;
import java.util.*;
public class ArrayLinkedlist {
    public static void main(String[] args){

        // Set arr = new LinkedHashSet<>();
       // List arr = new ArrayList(90);
        List arr = new LinkedList<>(); //List as a object reference -->so accepts all datatypes
        arr.add(10);
        arr.add(04);
        arr.add("Nikhila");
        arr.add(false);
        arr.contains(12.4);

        Set arr1 = new LinkedHashSet<>();
        arr1.add("Hey");
        arr1.add("hi");
        arr1.add("Hey");
        arr1.addAll(arr);

        System.out.println("arr1 : "+arr1);

        System.out.println("Original Arr : "+arr);
        System.out.println(arr.contains(12.4));
        arr.remove(false);
        System.out.println("Updated Arr : "+arr);
    }
}
//List --> ordered/allow duplicates
//Set --> Unordered/unique
//LinkedList--> Same as arraylist but diff implementation
//hashset()--> Unique elements and No index
//LinkedHashSet --> unique elements but also have index