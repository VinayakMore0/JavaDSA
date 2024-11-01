package L10TwoPointer;

import java.util.Arrays;

public class L10Quesion4 {

    public static void main(String[] args) {

        int[] people = {1,2,2,3};
        int limit = 3;

        System.out.println(numRescueBoats(people, limit));


        int[] nums = {1,5,8,4,7,6,5,3,1};

        int i = nums.length-2;
        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }

        if(i >= 0){
            int j = nums.length - 1;

            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);


        
    }

    public static void reverse(int[] nums, int start){
        int i = start, j = nums.length - 1;

        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static int numRescueBoats(int[] people, int limit){

        Arrays.sort(people);
        int res = 0;
        int i = 0;
        int j = people.length-1;

        while(i <= j){
            res ++;
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
        }

        return res;
    }

}
