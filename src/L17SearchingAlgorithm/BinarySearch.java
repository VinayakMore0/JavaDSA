package L17SearchingAlgorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 8};

        System.out.println(binarySearch(arr, 8));


        //Predefined Func
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.binarySearch(vowels, 'i'));

        int[] arr2 = {1, 2, 4, 5, 6};
        System.out.println(Arrays.binarySearch(arr2, 3));

        //(-(insertionPoint) - 1) => (-2 -1) => -3


    }


    public static int binarySearch(int[] arr, int key){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            System.out.print(left + " " + right);
            System.out.println();
            int mid = (left + right) / 2;   //OR    left + (right - left) / 2;  for large data
            System.out.print(mid);
            System.out.println();
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;

    }


}
