package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapFullExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();


//        Adding / Updating Entries
//        Method	Example	Notes
//        put(K key, V value)	map.put("Alice", 25);	Add or update a key-value pair
//        putIfAbsent(K key, V value)	map.putIfAbsent("Bob", 30);	Only adds if key not present
//        putAll(Map m)	map.putAll(otherMap);	Add all entries from another map

        // Add entries
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println("Initial Map: " + map);

        // Update
        map.put("Alice", 26);
        map.putIfAbsent("David", 40);
        System.out.println("After updates: " + map);

//        Access / Query Entries
//        Method	Example	Notes
//        get(Object key)	map.get("Alice");	Returns value for the key
//        containsKey(Object key)	map.containsKey("Bob");	True if key exists
//        containsValue(Object value)	map.containsValue(30);	True if value exists
//        isEmpty()	map.isEmpty();	True if map is empty
//        size()	map.size();	Number of key-value pairs

                // Access
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Contains Bob? " + map.containsKey("Bob"));

        // Iterate
        System.out.println("Iterating with entrySet:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

//        Removing Entries
//        Method	Example	Notes
//        remove(Object key)	map.remove("Alice");	Removes entry by key
//        remove(Object key, Object value)	map.remove("Bob", 30);	Removes only if key-value matches
//        clear()	map.clear();	Removes all entries

        // Remove
        map.remove("Bob");
        System.out.println("After removing Bob: " + map);

//        Other Useful Methods
//        Method	Example	Notes
//        replace(K key, V value)	map.replace("Alice", 27);	Replaces value of existing key
//        replace(K key, V oldValue, V newValue)	map.replace("Alice", 27, 28);	Conditional replace
//        getOrDefault(K key, V defaultValue)	map.getOrDefault("Tom", 0);	Returns default if key not found
//        compute(K key, BiFunction)	map.compute("Alice", (k,v) -> v+1);	Update value based on key
//        merge(K key, V value, BiFunction)	map.merge("Alice", 1, Integer::sum);	Merge with existing value

        // Other methods
        map.replace("Charlie", 36);
        System.out.println("After replace Charlie: " + map);

        int age = map.getOrDefault("Eve", 0);
        System.out.println("Eve's age (default): " + age);
    }
}
