package L15BasicSortingAlgo;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            boolean isSwaped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = false;
                }
            }
            if(!isSwaped) return;
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 9, 6, 8, 5, 4, 9};
        bubbleSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }

    }

}
