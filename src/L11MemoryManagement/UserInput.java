package L11MemoryManagement;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);

        System.out.println("Enter Text: ");
        String myString = input.next();
        String myString2 = input.nextLine();
        System.out.println("You Entered: " + myString);
        System.out.println("You Entered: " + myString2);

        input.close();

    }
}
