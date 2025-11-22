package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine();

        firstNonRepeatingCharacter(str);

    }

    public static void firstNonRepeatingCharacter(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
//        int cnt = 0;
        boolean flag = false;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeating character : " + entry.getKey());
                flag = true;
                break;
//                cnt++;
//                if (cnt == 2){
//                    System.out.println("Second non-repeating character : " + entry.getKey());
//                    break;
//                }
            }
        }
        if(!flag){
            System.out.println("No non-repeating charcter found!");
        }

    }
}
