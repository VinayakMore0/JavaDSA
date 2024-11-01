package L15BasicSortingAlgo;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int currentElement = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > currentElement){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 9, 6, 8, 5, 4, 9};
        insertionSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }

    }

}
