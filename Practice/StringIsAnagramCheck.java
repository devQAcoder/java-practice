package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringIsAnagramCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter a string2: ");
        String str2 = scanner.nextLine();

        scanner.close();

        if(str1.length() == (str2.length()) && returnStringAsMap(str1).equals(returnStringAsMap(str2))){
            System.out.println("Both strings are anagram");
        }
        else {
            System.out.println("String length of both strings differ / not anagram!");
        }

    }

    public static Map<Character, Integer> returnStringAsMap(String str1 ){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char  c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        return map;
    }
}
