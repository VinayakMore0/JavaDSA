package L16AdvancedSortingAlgo;

public class QuickSelect {

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

    public static int getRandom(int l, int r){
        return (int)((Math.random()*(r-l)) + l);
    }

    public static int f(int[] arr, int l, int r, int k){
        int pi = getRandom(l, r);
        int x = partition(arr, l, r, pi);
        if(x == k)
            return arr[x];
        else if(x < k)
            return f(arr, x + 1, r, k);
        else
            return f(arr, l, x - 1, k);
    }

    public static int quickSort(int[] arr, int k){
        return f(arr, 0, arr.length-1, k);
    }



    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 11, 2, -3, 6, 8, 0, 2};
        System.out.println(quickSort(arr, 7));



        
    }

}
