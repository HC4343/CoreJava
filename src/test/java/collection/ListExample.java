package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(77);
        values.add(2);
        values.add(88);

        Collections.sort(values); // .......> Helps us get values in sorted way(meaning in ascending order)

        values.forEach(System.out::println); // ........> Stream API..Lambda Expression

    }

}