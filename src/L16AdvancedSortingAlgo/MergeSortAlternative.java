package L16AdvancedSortingAlgo;

public class MergeSortAlternative {

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

    public static int[] f(int[] arr, int start, int end){
        if(end == start){
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        }
        int mid = (start + end) / 2;
        int[] left = f(arr, start, mid);
        int[] right = f(arr, mid+1, end);
        return mergeTwoSortedArray(left, right);
    }

    public static void mergeSort(int[] arr){
        int[] result = f(arr, 0, arr.length - 1);
        for(int i = 0; i < result.length; i++){
            arr[i] = result[i];
        }
    }


    public static void main(String[] args) {

        int[] arr = {5, 1, 9, -1, 3, 5, 1, 2, 3, 13, 19, 0, 4};
        mergeSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }

    }

}
