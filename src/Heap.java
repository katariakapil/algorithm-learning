import java.lang.reflect.Array;

public class Heap<T extends Comparable> {

    T[] data;
    int count;



    int getLeftChild(int index) {

        if (index > count )
        return -1;//
        else {
            return index * 2 + 1;// formula for 2*i+1;//left child index
        }
    }

    int getRightChild(int index) {

        if (index > count) {

            return -1;
        } else  {

            return index * 2 + 2;// formula for 2*i+2;//right child index
        }
    }

    int getParentIndex(int index) {

        if (index < 0 || index > count) return -1;

        return (index - 1)/2; //(i - 1)/2; return parent index
    }

    public Heap(Class<T> clazz, int size) {

        data = (T[])Array.newInstance(clazz, size);

    }
}
