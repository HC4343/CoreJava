package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;

public class CollectionSample {
    public static void main(String[] args){

        int values[] = new int[2];
        values[0] =3;
        values[1] =5;

        Object values1[] = new Object[2];
        values1[0] = "Hakan";
        values1[1] = 9;

        Collection<Integer> values3 = new ArrayList<Integer>();
        values3.add(7);
        values3.add(9);
        values3.add(1);

        System.out.println(values3); // --------> Gives values3 as Array List.

//      First Method: Using Iterator to extract numbers from ArrayList
        Iterator i = values3.iterator();

        while(i.hasNext()) {

            System.out.println(i.next());
        }

//      Second Method: Using enhanced forloop to extract numbers
        for (int j : values3) {
            System.out.println(j);

        }

    }
}
