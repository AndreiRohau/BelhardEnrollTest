package lastTheoryTask;

import java.util.LinkedList;

/**
 * Created by rohau.andrei on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Things> arr = new LinkedList<>();
        arr.add(new Car(11));
        arr.add(new Car(22));
        arr.add(new House(33));
        arr.add(new House(44));
        arr.add(new Laptop(55));
        arr.add(new Laptop(66));
        arr.add(new Laptop(77));

        for(Things e : arr) {
            e.price();
        }
    }
}

interface Price {
    void price();
}

class Things implements Price{
    public int price;

    public int getPrice() {
        return price;
    }

    @Override
    public void price() {
        System.out.println(getPrice());
    }
}

class Car extends Things {
    public Car(int price) {
        this.price = price;
    }
}

class House extends Things {
    public House(int price) {
        this.price = price;
    }
}

class Laptop extends Things {
    public Laptop(int price) {
        this.price = price;
    }
}

