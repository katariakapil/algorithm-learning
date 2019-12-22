package core_java;

import java.util.HashMap;

// this class cannot be subclassed
public final class FinalHashMap {

    /**
     * final means that you can’t change the object’s reference to point to another reference or another object,
     * but you can still mutate its state (using setter methods e.g). Whereas immutable means that the object’s actual
     * value can’t be changed, but you can change its reference to another one.
     * final modifier is applicable for variable but not for objects, Whereas immutability applicable for an object
     * but not for variables.
     * By declaring a reference variable as final, we won’t get any immutability nature, Even though reference variable
     * is final. We can perform any type of change in the corresponding Object. But we cant perform reassignment for
     * that variable.
     * final ensures that the address of the object remains the same whereas the Immutable suggests that we can’t
     * change the state of the object once created.
     * @param args
     */

    public static void main(String[] args) {

        final HashMap<Integer,Integer> map = new HashMap<>();
        final int i = 0;
        //i =10; error here cannot assign value to primitive type which is final.

        map.put(1,1);
        //map = new HashMap<>();  Error here since we cannot reassign value here due to final


        System.out.println(map.get(1));


    }

    // this method cannot be override is subclass, this is final method...
    public final void myfinal(){

        System.out.println("hello");
    }
}
