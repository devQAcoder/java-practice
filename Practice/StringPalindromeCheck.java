package Practice;

import java.util.Scanner;

public class StringPalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println(isPalindrome(str));

        scanner.close();

    }

//    public static boolean isPalindrome(String strIsPalindromeOrNot){
//        String reversed = "";
//
//        for(char c: strIsPalindromeOrNot.toLowerCase().toCharArray()){
//            reversed =  c + reversed;
//        }
//        System.out.println("reversed : " +reversed);
//        return (reversed.equals(strIsPalindromeOrNot));
//    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {

        // Convert string to lowercase for
        // case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
//        String rev = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev = rev + s.charAt(i);
//        }

//        String rev = "";
//        for(int i=s.length()-1; i>=0; i--){
//            rev = rev + s.charAt(i);
//        }
//
//        System.out.println("Reversed String: " + rev);
//
//        // Compare the original string with
//        // the reversed string
//        return s.equals(rev);
//    }

        int i=0, j = s.length() - 1;
        // Compare characters while i < j
        while(i < j){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(j));
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

//
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }

}
