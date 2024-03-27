package Day12;

import java.util.*;

public class EqualsCheck {

    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("hello");

        int i1 = 10;
        int i2 = 10;

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(i1 == i2);
        System.out.println(Objects.equals(i1, i2));
    }
}
// primitive data types ---> == /checks if both objects point to the same memory location
// Objects --> .equals() / checks the objects address
//