package collection;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(7);
        v.add(9);
        v.add(3);
        v.add(7);
        v.add(4);
        v.add(3);
        v.add(8);
        v.add(9);

        System.out.println(v.capacity()); // Capacity increases 100 percent when it exceeds its limit. For example, it becomes 20 after 10.

        for (int i: v) {
            System.out.println(i);

        }

    }
}
