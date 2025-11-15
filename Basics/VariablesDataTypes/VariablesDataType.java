package Basics.VariablesDataTypes;

public class VariablesDataType {

    public static void main(String[] args){

        int number = 50;

        char c = 'a';

        float floatNumber= 123.34f;

        double doubleNumber = 123.13d;

        boolean flag = false;

        System.out.println(number);

        //-- Get class types of a variable
        System.out.println(((Object) number).getClass().getSimpleName());

        System.out.println(c);

        System.out.println(flag);

        System.out.println(floatNumber);

        System.out.println(doubleNumber);

        System.out.print(((Object) floatNumber).getClass().getSimpleName());

    }

}