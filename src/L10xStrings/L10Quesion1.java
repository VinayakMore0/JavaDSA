package L10xStrings;

import java.util.Scanner;

public class L10Quesion1 {

    public static void main(String[] args) {

        //Q1 Palindrome

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(palindrome(str));



        



    }

    public static boolean palindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;


    }

}
