package L17SearchingAlgorithm;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {

        int n = 5;
        int c = 3;

        int[] arr = {1, 2, 8, 4, 9};

        System.out.println(distributeCows(arr, n, c));
    }

    public static int distributeCows(int[] arr, int n, int c){

        Arrays.sort(arr);
        int low = 1;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        int high = max;
        int ans = 0;
        while(low <= high){

            int mid = (low + high) / 2;

            if(good(arr, mid, n, c)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean good(int[] arr, int mid, int n, int c) {

        int count = 1;

        int last_pos = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] - last_pos >= mid){
                last_pos = arr[i];
                count++;
            }

            if(count == c){
                return true;
            }
        }

        return false;

    }

}
