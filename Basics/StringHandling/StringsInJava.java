package Basics.StringHandling;

import java.util.Arrays;

public class StringsInJava {

    public static void main(String[] args) {

        String str = "  This is a String in Java   ";

        System.out.println("length() - "+ str.length());

        System.out.println("charAt(3) - "+ str.charAt(3));

        System.out.println("substring(5) - "+ str.substring(5));

        System.out.println("substring(5, 15) - "+ str.substring(5, 15));

        System.out.println("concat(concatenating another String) - "+ str.concat("concatenating another String"));

        System.out.println("equalsIgnoreCase(str1) - "+ str.equalsIgnoreCase(str+"test"));

        System.out.println("equals(str) - "+ str.equals(str));

        System.out.println("contains( Java) - "+ str.contains(" Java"));

        System.out.println("startsWith(This) - "+ str.startsWith("This"));

        System.out.println("endsWith(Python) - "+ str.endsWith("Python"));

        System.out.println("indexOf(j) - " + str.indexOf('j')); // -1

        System.out.println("indexOf(g) - " + str.lastIndexOf('g')); // 15

        System.out.println("replace(g) - " + str.replace("Java",  "Python"));

        System.out.println("replaceAll(g) - " + str.replaceAll(" ", "_"));

        System.out.println("trim() - " + str.trim());

        System.out.println("toUpperCase() - " + str.toUpperCase());

        System.out.println("toUpperCase() - " + str.toLowerCase());

        System.out.println("isEmpty() - " + str.isEmpty());

        System.out.println("isBlank() - " + str.isBlank());

        System.out.println("Usage of Split function() and printing using for each loop");
        String[] words = str.split(" ");
        for(String w : words) {
            System.out.println(w);
        }

        System.out.println("Usage of Split function() and printing using Streams");
        Arrays.stream(str.split(" "))
                .forEach(System.out::println);
    }
}
