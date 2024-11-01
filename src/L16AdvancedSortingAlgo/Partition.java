package L16AdvancedSortingAlgo;

public class Partition {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int r, int pi){
        int pivot = arr[pi];
        swap(arr, pi, r);
        int m = l;
        for(int i = l; i <= r-1; i++){
            if(arr[i] < pivot){
                swap(arr, i, m);
                m++;
            }
        }
        swap(arr, m, r);
        return m;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 11, 2, -3, 6, 8, 0, 2};
        int p = partition(arr, 0, arr.length - 1, 6);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println("\n" + p);
    }
}
