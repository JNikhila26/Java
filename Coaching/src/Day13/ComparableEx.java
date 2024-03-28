package Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(12);
        l.add(4);

        List<String> ls = new ArrayList<>();
        ls.add("Nikki");
        ls.add("Nik");

        System.out.println("ls : "+ls);
        Collections.sort(ls);
        System.out.println("Updated ls : "+ls);

        System.out.println("l : "+l);
        Collections.sort(l);
        System.out.println("Updated l : "+l);
    }
}
