package chapter3__QUEUE_STACK;

import java.util.Stack;

public class Implement3StackWithArray {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,8,9};

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2= new Stack<>();
        Stack<Integer> s3 = new Stack<>();


        for (int i=0;i<ar.length;i +=3) {


            s1.push(ar[i]);
            s2.push(ar[i+1]);
            s3.push(ar[i+2]);

        }

        System.out.println("S1 > "+s1.toString());
        System.out.println("S2 > "+s2.toString());
        System.out.println("S3 > "+s3.toString());
    }



}
