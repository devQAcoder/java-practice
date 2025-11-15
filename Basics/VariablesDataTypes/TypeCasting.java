package Basics.VariablesDataTypes;

public class TypeCasting {

    public static void main(String[] args) {
        System.out.println("-------------------Converting int to float, double, String, char-----------------------");
        int intNumber = 99;

        //Convert int to...
        //float
        System.out.println((float)intNumber);

        //double
        System.out.println((double)intNumber);

        //String
        System.out.println(String.valueOf(intNumber));

        //char
        System.out.println((char) intNumber);


        System.out.println("-------------------Converting double to int, float, String, char-----------------------");
        double dValue  = 1123.234d;
        //Convert Double value to....
        //int
        System.out.println((int) dValue);
        //float
        System.out.println((float) dValue);
        //String
        System.out.println(String.valueOf(dValue).getClass().getSimpleName());
        //Char
        System.out.println(((char)((int) dValue)));

        System.out.println("-------------------Converting float to int, double, String, char-----------------------");
        float fValue = 123.34f;

        //Convert Float value to....
        //int
        System.out.println((int) fValue);

        //double
        System.out.println((double) fValue);

        //String
        System.out.println(String.valueOf(fValue));

        //Char
        System.out.println((char)((int) fValue));

        System.out.println("-------------------Converting char to int, double, String, float-----------------------");

        char ch = 'z';

        //Convert char to//
        //int
        System.out.println((int) ch);

        //float
        System.out.println((float)(int) ch);

        //double
        System.out.println((double) (int) ch);

        //String
        System.out.println(String.valueOf(ch));

        System.out.println("-------------------Converting String to int, double, char, float-----------------------");

        String str = "12399";

        //Convert String to ...
        //char
        System.out.println(str.toCharArray()[0]);
        //int
        System.out.println(Integer.parseInt(str));
        //double
        System.out.println(Double.parseDouble(str));
        //float
        System.out.println(Float.parseFloat(str));

    }
}
