package L17SearchingAlgorithm;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 6};

        System.out.println(linearSearch(arr, 5));


    }

    public static boolean linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

}
