package unit_fundamentals;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*

        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + 2*age + " years old.");


        int x = 0;
        int y = 0;

        System.out.println("Enter X: ");
        x = sc.nextInt();
        System.out.println("Enter Y: ");
        y = sc.nextInt();

        if( x > y){
            System.out.println( x + " is bigger than " + y);
            System.out.println( "Difference: " +  (x - y));
        }
        else if( x < y){
            System.out.println( x + " is smaller than " + y);
            System.out.println( "Difference: " +  (x - y));
        }
        else {
            System.out.print( x + " and " + y + " are the same.");
        }


        System.out.println("Pick a number between 1 and 5:");
        int number = sc.nextInt();
        int random = ThreadLocalRandom.current().nextInt(1,6);

        while( number != random){
            System.out.println( "Hard luck! Try again.");
            number = sc.nextInt();
        }
        if (number == random){
            System.out.println( "Correct! Aren't you lucky.");
        }


        System.out.println("Print numbers:");
        int number = 89;

        while (number < 118){
            System.out.println( number);
            number++;
        }

        System.out.println("Print numbers quack:");
        for(int i = 1 ; i < 41; i++) {
            System.out.println( i);
            if( i % 3 == 0){
                System.out.println( "Quack");
            }
        }

        System.out.println("Insert the password:");
        String password = sc.next();

        while( !password.equals("shark50")){
            System.out.println( "Wrong password! Try again.");
            password = sc.next();
        }
            System.out.println( "ACCESS APPROVED");


        int randomNum = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Pick a number between 1 and 100:");
        int numberRead = sc.nextInt();
        int times = 0;

        while( numberRead != randomNum){
            if(numberRead < randomNum){
                System.out.println( "HIGHER");
            }
            else {
                System.out.println( "LOWER");
            }
            System.out.println( "Insert again:");
            times++;
            numberRead = sc.nextInt();
        }
        times++;
        System.out.println( "CORRECT. You made it on " + times + " guesses!");


        int[] intArr = new int[10];
        intArr[0] = 45;
        intArr[1] = 865;
        intArr[2] = 23;
        intArr[3] = 6;
        intArr[4] = 368;
        intArr[5] = 9032;
        intArr[6] = 557;
        intArr[7] = 226;
        intArr[8] = 834564;
        intArr[9] = 34001;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }


        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++){
            intArr[i] = i+1;
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }

        double[] doubleArr = new double[5];
        double sumTotal = 0;
        double average = 0;
        doubleArr[0] = 2.31;
        doubleArr[1] = 2.77;
        doubleArr[2] = 1.20;
        doubleArr[3] = 3.31;
        doubleArr[4] = 2.26;

        for (int i = 0; i < doubleArr.length; i++){
            sumTotal += doubleArr[i];
        }

        average = sumTotal / doubleArr.length;
        System.out.println("Total: "+ sumTotal);
        System.out.println("Média: "+ average);

        */

        System.out.println("Enter your top 5 favourite food:");
        String[] foodArr = new String[3];

        for(int i = 0; i < foodArr.length; i++){
             foodArr[i] = sc.nextLine();
        }
        System.out.println("No more memory available.");
        System.out.println("Your favourite foods are:");
        for(String i : foodArr){
            System.out.println(i);
        }


    }
}
