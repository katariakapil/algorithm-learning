package epi.chapter5_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMoveEvenOdd {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list.get(0));

        int even = 0;
        int odd = list.size() -1;

        while (even < odd) {

            if (list.get(even) % 2 == 0) {
                even++;
            } else {
                Collections.swap(list, even , odd --);
            }
        }


        System.out.println(list.toString());


    }
}
