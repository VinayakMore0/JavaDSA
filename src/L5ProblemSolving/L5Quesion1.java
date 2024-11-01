package L5ProblemSolving;

import java.util.Scanner;

public class L5Quesion1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //Fibonachi Series
        int n = scn.nextInt();
        int sum = 0;
        int a=0, b=1;
        for(int i=0;i<=n;i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b;
        }











    }
}
