package core_java;

import java.util.Random;

public class Hashing {
    public static void main(String[] args) {

        Random r = new Random();

        int i = r.nextInt(8);
        System.out.println("i"+ i);

        String s = "2342r2fw232rfw23";
        int hash = s.hashCode();



        System.out.println("HASH CODE " + hash + " "+ hash%8);

    }
}
