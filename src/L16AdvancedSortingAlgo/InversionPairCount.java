package L16AdvancedSortingAlgo;

import java.util.Scanner;

public class InversionPairCount {

    public static long count = 0;

    public static int[] mergeTwoSortedArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                result[k++] = a[i++];
            }else{
                count += (a.length - i);
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

    public static void main(String[] args) throws java.lang.Exception {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            t--;
            count = 0;
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = scn.nextInt();
            mergeSort(arr);
            System.out.println(count);
        }

    }
}
