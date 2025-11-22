package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachCharacterOccurrence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        scanner.close();

        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }


        System.out.println(map);

    }

}
