package L5xPatternProblem;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int trow = scn.nextInt();
        int spaces = trow-1;
        int stars = 1;

        for(int row=1; row<=trow; row++){

            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }
            System.out.println();
            spaces --;
            stars +=2;
        }



    }
}
