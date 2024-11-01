package L12Recursion;

public class Recursion1 {


    public static int factorial (int n){

        if(n == 1)return 1;
        return n * factorial(n - 1);
    }

    public static int toThePower(int a, int b){
        if(b == 0) return 1;
        return a * toThePower(a, b-1);
    }

    public static void decreasingOrder(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        decreasingOrder(n-1);

    }

    public static void increasingOrder(int n){
        if(n == 0) return;
        increasingOrder(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {

        //Q1 n!
        System.out.println(factorial(5));

        //Q2 a^b
        System.out.println(toThePower(2,6));

        //Q3 Print n nos in decreasing order
        decreasingOrder(5);

        //Q4 In increasing order
        increasingOrder(11);




    }

}
