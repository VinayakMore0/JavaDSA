package L16AdvancedSortingAlgo;

public class MergeSort {

    public static int[] mergeTwoSortedArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
            }
        }

        while(i < n){
            result[k++] = a[i++];
        }

        while(j < m){
            result[k++] = b[j++];
        }

        return result;
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];
        int k = 0;
        for(int i = start; i <= mid; i++){
            left[k++] = arr[i];
        }
        k = 0;
        for(int i = mid+1; i <= end; i++){
            right[k++] = arr[i];
        }

        int[] result = mergeTwoSortedArray(left, right);

        k = 0;
        for(int i = start; i <= end; i++){
            arr[i] = result[k++];
        }

    }

    public static void f(int[] arr, int start, int end){
        if(end <= start) return;
        int mid = (start + end) / 2;
        f(arr, start, mid);
        f(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void mergeSort(int[] arr){
        f(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 11, 2, -3, 6, 8, 0, 2};
        mergeSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }

    }

}
