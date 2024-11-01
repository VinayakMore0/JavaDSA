package L10xStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L10Quesion3 {

    public static void main(String[] args) {

        //Q1 Largest SubString between Two Equal Characters
        String s = new String("abcba");
        System.out.println(maxLengthBetweenEqualCharacters(s));


        //Q2 Reverse words in a String
        String words = new String("   the   sky  is    blue");
        System.out.println(reverseWords(words));


        //Q3 Valid Palindrome
        String palindromeWord = new String("A man,a plan, a canal: Panama");
        System.out.println(isPalindrome(palindromeWord));


        //Q4 Largest Odd Number in String
        String num = new String("35427");
        System.out.println(largestOddNumber(num));

    }


    public static String largestOddNumber(String num){

        for(int i = num.length() - 1; i >= 0; i--){
                if(num.charAt(i) % 2 != 0) return num.substring(0, i + 1);
        }

        return "";

    }


    public static boolean isPalindrome(String s){

        for(int i = 0, j = s.length() - 1; i < j; i++, j--){

            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

        }

        return true;
    }


    public static String reverseWords(String s){
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));

        Collections.reverse(wordList);
//        System.out.println(wordList);

        return String.join(" ", wordList);

    }


    public static int maxLengthBetweenEqualCharacters(String s) {

        int[] indices = new int[26];

        int maxLen = -1;

        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';

            if(indices[idx] > 0){
                maxLen = Math.max(maxLen, i - indices[idx]);
            }else{
                indices[idx] = i + 1;
            }
        }
        return maxLen;
    }
}
