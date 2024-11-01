package L1HelloWorld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){

        System.out.println("1. println");
        System.out.println("2. println");

        System.out.println("1. print ");
        System.out.println("2. print ");

        //System.out.printf(format, args)
        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Java is %d percent fun!%n", 100);

        int val = 10;

        System.out.println(val);
        System.out.println(5);

        System.out.println("I am " + "awesome at programming");
        System.out.println("Number = " + val);

        // Create an object of Scanner Class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        //take input from user
        int number = input.nextInt();

        System.out.println("You entered " + number);

        float myFloat = input.nextFloat();

        double myDouble = input.nextDouble();

        String myString = input.next();

        // next() -> read word from the user
        // nextLine() -> read a line from the user.

    }

}
