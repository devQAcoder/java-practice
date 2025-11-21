package CollectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Can have duplicates, dynamic sizing, add(), get(), remove() , clear(), lastIndexOf()
        List<String> cars = new ArrayList<>();

        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Dodge");
        cars.add("Mustang");
        cars.add("Honda");


        System.out.println("Cars :"+cars);

        // Get lastIndexOf - last occurrence of object
        System.out.println("Get Last Index of 'Honda' - "+cars.lastIndexOf("Honda"));

        System.out.println(cars.remove("Honda"));

        System.out.println("Removing Honda");
        System.out.println(cars);

        // Inserting at index a new object
        cars.add(1, "Ferrari");

        // Iterate
        System.out.println("Iterating:");
        for(String c : cars){
            System.out.println(c);
        }

        // size
        System.out.println("Size:" + cars.size());

        // getFirst()
        System.out.println("Size:" + cars.getFirst());

        // getLast()
        System.out.println("Size:" + cars.getLast());

        // Add all elements from another collection
        cars.addAll(Arrays.asList("Maserati", "Alfa Romeo"));

        // Cleared List
        System.out.println("Clearing the list using clear()");
        cars.clear();

        // Cleared List
        System.out.println("Check cars is empty or not post clear() : " + cars.isEmpty());

    }
}
