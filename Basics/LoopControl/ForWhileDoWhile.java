package Basics.LoopControl;

public class ForWhileDoWhile {

    public static void main(String[] args){

        //factorial of a number using -

        // for loop
        int num = 5;
        int fact = 1;
        int i = 0;
        for(i =1; i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of a number using FOR loop is " + fact);

        //while loop
        i =1;
        fact = 1;
        while(i<=num){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of a number using WHILE loop is " + fact);

        //do while loop
        i = 1;
        fact = 1;
        do{
        fact = fact * i;
        i++;
        }while(i<=num);
        System.out.println("Factorial of a number using DO WHILE loop is " + fact);
    }
}
