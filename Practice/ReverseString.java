package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        String str = new String("Don't count the days, make the days count");

        System.out.println("Original String:" + str);
        System.out.println("\n");

        String reverseStr = null;
        int i = 1;
        //---Using foreach loop + toCharArray
        for (char c : str.toCharArray()){
            reverseStr = c + reverseStr;
        }
        System.out.println("Reversed String using foreach loop with toCharArray(): " + reverseStr);

        reverseStr ="";
        i=0;

        //---Using for loop + charAt() method
        for(i=0;  i<=str.length()-1; i++){
            reverseStr = str.charAt(i) + reverseStr;
        }
        System.out.println("Using for loop + charAt() method" + reverseStr);

        //--- Using StringBuilder
        System.out.println("Using StringBuilder object.reverse() :" + new StringBuilder(str).reverse());

        //--- Using list
        List<Character> characterList = new ArrayList<>();
        for (char c : str.toCharArray()){
            characterList.add(c);
        }

        System.out.println("characterList" + characterList);

        //Collections.reverse()
        Collections.reverse(characterList);
        System.out.println("Post Collections.reverse(): " +  characterList);
        reverseStr="";
        for (char c : characterList){
            reverseStr = reverseStr + c ;
        }
        System.out.println("reverseStr using List<Character> and append at of the string - " + reverseStr);

    }
}
