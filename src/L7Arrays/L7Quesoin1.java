package L7Arrays;

import java.util.Scanner;

public class L7Quesoin1 {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        //Q1
        int[] arr = {10, 20, 30, 40, 50};
        display(arr);
        reverse(arr);
        display(arr);


        //Q2
        int[] arr2 = {4, 5, 3, 1, 9};
        minimumEle(arr2);


        //Q3
        int[] arr3 = {1, 2, 3, 4, 5};
        display(arr3);
        System.out.println("Enter amt of rotation is array:     ");
        int rotation = scn.nextInt();
        rorateEle(arr3,rotation);


    }


    public static void rorateEle(int[] arr, int k){

        k = k % arr.length;
        if(k<0){
            k = k + arr.length;
            for(int r=1; r<=k; r++){
                int temp = arr[arr.length-1];
                for(int i= arr.length-1; i>0; i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
            }

        }else{
            for(int r=1; r<=k; r++){
                int temp = arr[arr.length-1];
                for(int i=arr.length-1; i>0; i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
            }
        }

        display(arr);
        
    }

    public static void minimumEle(int[] arr){

        int min = Integer.MAX_VALUE;
        //int min = arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);

    }

    public static void display(int[] arr){
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }


    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


    }


}
