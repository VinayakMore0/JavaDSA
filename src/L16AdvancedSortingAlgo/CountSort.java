package L16AdvancedSortingAlgo;

public class CountSort {

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void countSort(int[] arr, int[] output) {

        int n = arr.length;
        int min = minElement(arr);
        int max = maxElement(arr);
        int range = max - min + 1;  // Range of elements in the array

        int[] freq = new int[range];  // Frequency array

        // Step 1: Count frequency of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i] - min]++;
        }

        // Step 2: Update the frequency array to store cumulative sums
        for (int i = 1; i < range; i++) {
            freq[i] += freq[i - 1];
        }

        // Step 3: Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[freq[arr[i] - min] - 1] = arr[i];
            freq[arr[i] - min]--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1, 4, 1, 2, 7, 5, 2};
        int[] output = new int[arr.length];
        countSort(arr, output);
        for (int val : output) {
            System.out.print(val + " ");
        }
    }

}
