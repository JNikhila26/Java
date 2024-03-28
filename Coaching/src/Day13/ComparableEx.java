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

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
    }
}
