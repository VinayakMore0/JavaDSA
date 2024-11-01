package L5xPatternProblem;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //pattern1

        int n = scn.nextInt();

        int trows = n;

        for (int row = 1; row <= trows; row++) {
            //work for current line
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("*");
            }
            //prepare for new row
            System.out.println();
        }

    }
}
