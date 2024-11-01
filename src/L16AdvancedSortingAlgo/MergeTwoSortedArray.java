package L16AdvancedSortingAlgo;

public class MergeTwoSortedArray {

    public static int[] mergeTwoSortedArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
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

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7, 8, 9, 11, 16, 20};
        int[] b = {2, 4, 7, 10, 25};
        int[] result = mergeTwoSortedArray(a, b);
        for(int val : result){
            System.out.print(val + " ");
        }
    }

}
