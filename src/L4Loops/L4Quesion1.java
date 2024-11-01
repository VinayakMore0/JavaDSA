package L4Loops;

import java.util.Scanner;

public class L4Quesion1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Prime number true or false
        boolean isPrime = true;
        int num = scn.nextInt();

        for(int i=2;i<=num/2;i++){
            if(i%num==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //OR

        int n = scn.nextInt();
        int div = 2;
        int flag = 0;

        while(div<=n-1){
            if(n%div==0){
                flag = 1;
                break;
            }
            div += 1;
        }
        if(flag==1){
            System.out.println("False");
        }else{
            System.out.println("True");
        }


    }
}
