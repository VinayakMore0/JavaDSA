package L12Recursion;

public class Recursion2 {

    public static int fibonacci(int n){
        if(n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binaryString(int x){
        if(x == 1) return 2;
        if(x == 2) return 3;
        return binaryString(x - 1) + binaryString(x - 2);
    }

    public static void printArray (int[] arr, int idx){
        if(idx >= arr.length) return;
        System.out.println(arr[idx]);
        printArray(arr, idx + 1);
    }


    public static int maxArray(int[] arr, int idx){

        if(idx == arr.length - 1) return arr[idx];

        return Math.max(arr[idx], maxArray(arr, idx + 1));
    }

    public static int sumOfArray(int[] arr, int idx){

        if(idx == arr.length - 1) return arr[idx];

        return arr[idx] + sumOfArray(arr, idx + 1);
    }

    public static int occOfNumber(int[] arr, int idx, int x){
        if(idx >= arr.length - 1) return -1;

        return (arr[idx] == x) ? idx : occOfNumber(arr, idx + 1, x);
    }


    public static int houseRobber(int[] arr, int idx){
        if(idx >= arr.length) return 0;

        return Math.max(arr[idx] + houseRobber(arr, idx + 2), 0 + houseRobber(arr, idx + 1));
    }



    public static void main(String[] args) {

        //Q1 fibonacci
        System.out.println(fibonacci(4));

        //Q2 No. of binary string, which had no consecutive one
        System.out.println(binaryString(4));

        //Q3 Print Array recursively
        int[] arr = {11, 21, 5, 3, 9};
        printArray(arr, 0);

        //Q4 Max Number in an Array
        int[] arr2 = { 3, 1, 6, 9, 21, 0, -1};
        System.out.println(maxArray(arr2, 0));

        //Q5 Sum of Array
        int[] arr3 = {3, 5, 5, 6, 3, 6, 4};
        System.out.println(sumOfArray(arr3, 0));

        //Q6 Occ. of number in Array
        int[] arr4 = {3, 5, 5, 6, 3, 6, 4};
        System.out.println(occOfNumber(arr4, 0, 7));

        //Q7 House Robber
        int[] arr5 = {3, 1, 1, 9};
        System.out.println(houseRobber(arr5, 0));




    }

}
