package L17SearchingAlgorithm;

public class TernarySearch {

    public static void main(String[] args) {

        //It is not that optimized, or have higher complexity compare to binary

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(ternarySearch(arr, 6));

    }

    public static int ternarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if(arr[mid1] == key) return mid1;
            if(arr[mid2] == key) return mid2;

            if(key < arr[mid1]){
                right = mid1 - 1;
            }else if(key > arr[mid2]){
                left = mid2 + 1;
            }else{
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        return - 1;

    }

}
