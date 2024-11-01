package L8ArrayList;

import java.util.ArrayList;

public class L8Quesion1 {
    public static void main(String[] args) {

        //Q1 intersection
        int[] one = {10,19,20,30,40,40,40,50};
        int[] two = {15,16,17,20,25,30,30,40};

        System.out.println(intersection(one,two));


        //Q2 Add
        int[] one1 = {9,9,5,8};
        int[] two2 = {6,7};

        System.out.println(sumOfTwoArrays(one1,two2));


        //Q3 running sum
        int[] one_1 = {1,2,3,4};

        System.out.println(runningSumOfArray(one_1));



    }

    private static ArrayList<Integer> runningSumOfArray(int[] one) {

        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        int pre = 0;
        int pos = 0;

        for(int i=0; i<one.length; i++){

            pre = one[i];
            sum = pre + pos;
            pos = sum ;

            ans.add(i,sum);
        }

        return ans;

        //OR prefix sum approach
        /*
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
         */


    }

    private static ArrayList<Integer> sumOfTwoArrays(int[] one, int[] two) {

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 0;

        int i = one.length-1;
        int j = two.length-1;

        while(i>=0 || j>=0){
            int sum = 0;

            if(i >= 0){
                sum += one[i];
            }

            if(j >= 0){
                sum += two[j];
            }

            sum += carry;

            int rem = sum % 10;
            carry = sum / 10;

            ans.add(0, rem);

            i--;
            j--;
        }
        if(carry != 0){
            ans.add(0,carry);
        }

        return ans;

    }

    public static ArrayList<Integer> intersection(int[] one, int[] two){

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < one.length && j< two.length){
            if(one[i] < two[j]){
                i++;
            }else if(one[i] > two[j]){
                j++;
            }else{
                ans.add(one[i]);
                i++;
                j++;
            }
        }

        return ans;

    }


}
