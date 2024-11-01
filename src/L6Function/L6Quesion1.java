package L6Function;

import java.util.Scanner;

public class L6Quesion1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        boolean flag = false;
        int og =n;

        if(n<=0){
            System.out.println("Number should be positive");
        }else{
            int a = n%10;
            int b = (n/10)%10;
            int c = (n/100)%10;
            int nod = 0;

            while(n>0){
                 n /= 10;
                 nod++;
            }

            int sum = (int) (Math.pow(a,nod) + Math.pow(b,nod) + Math.pow(c,nod));

            if(og == sum){
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }

        //OR

        System.out.println(isArmstrong(n));

        // between two numbers

        int lo = scn.nextInt();
        int high = scn.nextInt();

        printArmstrongNumbers(lo,high);


    }

    public static void printArmstrongNumbers(int lo, int high){

        for(int i=lo; i<=high; i++){

            boolean res = isArmstrong(i);
            if(res){
                System.out.println(i);
            }

        }

    }


    public static boolean isArmstrong(int n){

        int nod = countDigits(n);

        int on = n;
        int sum = 0;

        while(n>0){

            int rem = n%10;
            sum += Math.pow(rem, nod);
            n = n/10;
        }

        if(sum == on){
            return true;
        }else {
            return false;
        }

    }


    public static int countDigits(int n){

        int nod = 0;

        while(n>0){
            n = n/10;
            nod++;
        }
        return nod;
    }


}
