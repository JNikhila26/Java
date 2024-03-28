package Day13;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQ {
    public static void main(String[] args) {
        Queue qu = new PriorityQueue<Integer>();
        qu.add(5);
        qu.add(1);
        qu.add(2);
        qu.add(7);

        System.out.println(qu);
        // Poll --> Printing the top element and removing it
        qu.poll();
        System.out.println(qu);

        qu.add(3);
        System.out.println(qu);

        // Printing the top element
        qu.peek();
        System.out.println(qu);
    }
}
