package L12Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion4 {

    public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> result = new ArrayList<String>();

    public static void func(String str, int idx, String output){
        if(idx == str.length()){
            result.add(output);
            return;
        }
        int digit = str.charAt(idx) - '0';
        for(int k = 0; k < map[digit].length(); k++){
            func(str, idx+1, output + map[digit].charAt(k));
        }
    }

    public static List<String> letterCombination(String digits){
        result.clear();
        if(digits.length() == 0) return result;
        func(digits, 0, "");
        return result;
    }

    public static List<Integer> result2 = new ArrayList<Integer>();
    public static void f(int i, int n){

        if(i <= n){
            if(i != 0) result2.add(i);
        }else{
            return;
        }

        for(int k = 0; k <= 9; k++){
            if(i == 0 && k == 0) continue;
            f(10 * i + k, n);

        }
    }


    public static List<Integer> lexicalOrder(int n) {
        result2.clear();
        f(0, n);
        return result2;
    }


    public static int count = 0;
    public static void mazePath(int i, int j, int m, int n, String output){
        if(i == m-1 && j == n-1){
            System.out.println(output);
            count++;
            return;
        }

        if(i >= m || j >= n) return;
        mazePath(i, j+1, m, n, output + 'R');
        mazePath(i+1, j, m, n, output + 'D');

    }


    public static void main(String[] args) {

        //Q1 Letter combination of a Phone Number
        System.out.println(letterCombination("34"));

        //Q2 Lexicographical Numbers
        System.out.println(lexicalOrder(20 ));

        //Q3 All possibilities paths of top left to bottom right
        int m = 3, n = 3;
        count = 0;
        mazePath(0, 0, m, n, "");
        System.out.println(count);
        // 4!/(2! * 2!) = 4*3 / 2 -> 6


    }

}
