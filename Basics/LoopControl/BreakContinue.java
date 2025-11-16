package Basics.LoopControl;

public class BreakContinue {
    public static void main(String[] args){

        int number= 9;

        //break keyword
        int i =0;
        for(i=1; i<=number; i++){
            if(i==8){
                System.out.println("Breaking out of FOR loop at " + String.valueOf(i));
                break;
            }
            System.out.println(i);
        }

        i=1;
        while(i<=number){
            if(i==7){
                System.out.println("Breaking out of WHILE loop at " + String.valueOf(i));
                break;
            }
            System.out.println(i);
            i++;
        }

        i=1;
        do{
            if(i==5){
                System.out.println("Breaking out of D0 WHILE loop at " + String.valueOf(i));
                break;
            }
            System.out.println(i);
            i++;
        }while(i<=number);

        // continue keyword
        for(i=1;i<=number;i++){
            if(i==6){
                System.out.println("Skipping i - " + i + " and continuing the FOR loop execution");
                continue;
            }
            System.out.println(i);
        }

        //*** --------------- Increment before continur in while loops to avoid infinite loop problem
        i=1;
        while(i<=number){
            if(i==6){
                System.out.println("Skipping i - " + i + " and continuing the WHILE loop execution");
                i++; // increment BEFORE continue
                continue; // skip this iteration
            }
            i++;
            System.out.println(i);
        }

        i=1;
        do{
            if(i==6){
                System.out.println("Skipping i - " + i + " and continuing the DO WHILE loop execution");
                i++; // increment BEFORE continue
                continue; // skip this iteration
            }
            System.out.println(i);
            i++;
        }while(i<=number);
    }
}
