package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println(reverseWordPositionsInAString(str));
    }

    public static String reverseWordPositionsInAString(String actualString){

        List<String> stringArrayList = Arrays.asList(actualString.split(" "));
        StringBuilder reversedWords = new StringBuilder();
        for(int i=stringArrayList.size()-1; i>=0; i--){
           reversedWords.append(stringArrayList.get(i)).append(" ");
        }
        return reversedWords.toString().trim();
    }
// Using streams
//    String reversed = Arrays.stream(actualString.split(" "))
//            .reduce((first, second) -> second + " " + first)
//            .orElse("");
//System.out.println(reversed);
//return reversed;

}
