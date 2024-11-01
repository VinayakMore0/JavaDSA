package L12Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion5 {

    public static int singleOrTeam(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        return singleOrTeam(n-1) + (n-1) * singleOrTeam(n - 2);

    }

    public static int tilingOfBoard(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return tilingOfBoard(n - 1) + tilingOfBoard(n - 2);
    }


    public static List<String> parentheses = new ArrayList<String>();

    public static List<String> generateParentheses(int n){
        generatingParentheses(n, 0, 0, "");
        return parentheses;
    }



    public static void generatingParentheses(int n, int o, int c, String output){

        if(o == c && o + c == n * 2){
            parentheses.add(output);
            return;
        }

        if(o < n){
            generatingParentheses(n, o+1, c, output + '(');
        }
        if(c < o) {
            generatingParentheses(n, o, c + 1, output + ')');
        }

    }


    public static int count = 0;

    public static void powerSum(int x, int n, int i){

        if(x == 0) count++;

        if(power(i, n) > x) return ;

        if(i * i > x) return ;

        powerSum(x - power(i,n), n, i+1);
        powerSum(x, n, i+1);

    }


    private static int power(int i, int n){
        int num = i;
        for(int j = 1; j < n; j++){
            i *= num;
        }

        return i;
    }

    public static void decodingACode(String str,int idx, StringBuilder path, List<String> results){

        if(idx == str.length()){
            results.add(path.toString());
            return;
        }

        if(str.charAt(idx) != '0'){
            path.append((char) (str.charAt(idx) - '1' + 'A'));
            decodingACode(str, idx + 1, path, results);
            path.deleteCharAt(path.length()-1);
        }

        if(idx + 1 < str.length() && str.charAt(idx) != '0' && Integer.parseInt(str.substring(idx, idx + 2)) <= 26){
            path.append((char) (Integer.parseInt(str.substring(idx, idx + 2)) - 1 + 'A'));
            decodingACode(str, idx + 2, path, results);
            path.deleteCharAt(path.length() - 1);
        }

    }



    public static void main(String[] args) {

        //Q1 Total no of ways in which friends can remain single or can be picked up
        System.out.println(singleOrTeam(3));

        //Q2 Ways of Filing the board of 2*n by 2*1 tiles
        System.out.println(tilingOfBoard(4));

        //Q3 Generate Parentheses
        System.out.println(generateParentheses(3));

        //Q4 The Power Sum
        powerSum(10, 2, 1);
        System.out.println(count);

        //Q5 Printing A CODE
        String aCode = "25114";
        List<String> results = new ArrayList<>();
        decodingACode(aCode, 0, new StringBuilder(), results);
        for(String decoding : results){
            System.out.println(decoding);
        }


    }

}
