package L5xPatternProblem;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int trows = scn.nextInt();
        int stars = 1;
        int spaces = trows/2;

        for(int row=1; row<=trows; row++){
            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            for (int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }
            System.out.println();
            if (row<=trows/2){
                stars += 2;
                spaces -= 1;
            }else{
                stars -= 2   ;
                spaces += 1;
            }
        }










    }
}
