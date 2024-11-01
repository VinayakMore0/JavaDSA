package L5xPatternProblem;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int trows = scn.nextInt();
        int stars = 1;
        int spaces = trows-2;

        for(int row=1; row<=trows; row++){
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }

            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }

            int sstars = stars;
            if(row == trows/2+1){
                sstars = stars-1;
            }

            for(int cst=1; cst<=sstars; cst++){
                System.out.print("*");
            }
            System.out.println();

            if(row<=trows/2){
                stars ++;
                spaces -= 2;
            }else{
                stars --;
                spaces += 2;
            }
        }


    }
}
