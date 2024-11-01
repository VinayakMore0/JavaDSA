package L5xPatternProblem;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int trows = scn.nextInt();
        int stars= 1;

        for(int row=1; row<=trows; row++){
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row <= trows/2){
                stars++;
            }else{
                stars--;
            }
        }


        //with number

        int tnum = scn.nextInt();
        int tcols = tnum*2-1 ;
        int num = 1;

        for(int row=1; row<=tcols; row++){
            for(int cno=1; cno<=num; cno++){
                System.out.print(cno);
            }
            System.out.println();
            if(row <= tcols/2){
                num++;
            }else {
                num--;
            }
        }

    }
}
