package hacker;

import java.util.Arrays;

public class CarParkingDilema {

    public static void main(String[] args) {

        int[] cars = {2,10,8,17};
        int k = 3;

        Arrays.sort(cars);

        int min = Integer.MAX_VALUE;
        for (int i=0;i<=cars.length -k;i++) {

            System.out.println("Index "+ (i  + k -1));

            min = Math.min(min  , cars[i  + k -1]  - cars[i]);
            System.out.println(min);

        }

        System.out.println(min + 1 );
    }
}
