package chapter3__QUEUE_STACK;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    Queue<Dog> dogQueue = new LinkedList<>();
    Queue<Cat> catQueue = new LinkedList<>();
    int order = 0;


    public void enqueue(Animal animal) {
        if (animal instanceof Dog) enqueueDog((Dog) animal);
        if (animal instanceof Cat) enqueueCat((Cat) animal);
    }
    public Animal dequeue() {

        if (dogQueue.size() == 0)
            catQueue.poll();
        else if (catQueue.size() == 0)
            dogQueue.poll();

        Dog dog = dogQueue.peek();//get first element
        Cat cat = catQueue.peek();

        if (dog.isOlder(cat)) {
            return dogQueue.poll();
        } else {
            return catQueue.poll();
        }

    }
    public void enqueueDog(Dog dog) {
        dog.setOrder(order + 1);
        dogQueue.offer(dog);
    }
    public void enqueueCat(Cat cat) {
        cat.setOrder(order + 1);
        catQueue.offer(cat);
    }

    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    public Cat dequeueCat() {
        return catQueue.poll();
    }

}

abstract class Animal<T>{

    int order;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean isOlder(Animal a) {
        return this.order < a.order;
    }
}

class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
}

class Cat extends Animal{
    public Cat(String name) {
       super(name);
   }
}
