package Day11;

import java.util.List;
import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args){

        List arr = new ArrayList(90);
        arr.add(10);
        arr.add(04);
        arr.add("Nikhila");
        arr.add(false);
        arr.contains(12.4);

        System.out.println("Original Arr : "+arr);
        System.out.println(arr.contains(12.4));
        arr.remove(false);
        System.out.println("Updated Arr : "+arr);
    }
}
