package L4Loops;

import java.util.Scanner;

public class IterativeStatement {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = 5;

        for(int i=1; i<=n; i++){
            System.out.println(i+" Hello");
        }

        // sum of natural number 1 to 1000
        int sum = scn.nextInt();
        for(int j=1;j<=1000;j++){
            sum += j;
        }

        System.out.println(sum);






    }
}
