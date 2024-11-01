package L15BasicSortingAlgo;

public class KthOrderStat {

    public static int kthLargestEle(int[] arr, int k){
        int n = arr.length;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[n - k];
    }


    public static void main(String[] args) {

        int[] arr = {4, 1, 16, 3, 2, -1};
        int k = 2;
        System.out.println(kthLargestEle(arr, k));

    }

}
