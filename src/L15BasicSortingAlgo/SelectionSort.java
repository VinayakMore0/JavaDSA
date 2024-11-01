package L15BasicSortingAlgo;

public class SelectionSort {

    public static int getMinimumElement(int[] arr, int start){
        int minIndex = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = getMinimumElement(arr, i);
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {13, 1, 4, 6, 7, 9};
        selectionSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }


    }

}
