package L13Backtracking;

public class Permutation {

    public static void main(String[] args) {

        printPermutation("abc", "");

        printPermutationBacktracking("abc", 0, 2);

    }

    public static void printPermutation(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < ques.length(); i++){

            String roq = ques.substring(0, i) + ques.substring(i + 1);

            printPermutation(roq, ans + ques.charAt(i));

        }
    }

    public static void printPermutationBacktracking(String str, int l, int r){

        if(l == r){
            System.out.println(str);
        }else{
            for(int i = l; i <= r; i++){

                str = swap(str, l, i);

                printPermutationBacktracking(str, l + 1, r);

                str = swap(str, l, i);

            }
        }
    }

    public static String swap(String a, int i, int j){
        char temp;
        char[] arr = a.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);
    }
}
