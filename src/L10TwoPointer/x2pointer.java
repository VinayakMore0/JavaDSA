package L10TwoPointer;

import L7Arrays.Arrays;

public class x2pointer {

    public static void main(String[] args) {

        //Q1 Remove Duplicates from Sorted Array
        int[] nums = {2,2,3,4,5,5,7,7,9,};

        int iIdx = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                nums[iIdx] = nums[i];
                iIdx++;
            }
        }

        System.out.println(iIdx);
        for(int val: nums){
            System.out.print(val + " ");
        }

        //Q2 Two Sum II - Input Array is Sorted

        int[] numbers = {-1,0,2,7,11,15};
        System.out.println();
        int target = 9;
        int[] twoSum = new int[2];

//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i+1; j < numbers.length; j++){
//                int sum = numbers[i] + numbers[j];
//                if(sum == target){
//                    twoSum[0] = i+1;
//                    twoSum[1] = j+1;
//                }
//            }
//        }

        //OR

        int low = 0;
        int high = numbers.length - 1;
        while(low < high){

            int sum = numbers[low] + numbers[high];

            if(sum == target){
                 twoSum = new int[]{low + 1, high + 1};
            }else if(sum < target){
                low++;
            }else{
                high--;
            }
        }
        for(int val : twoSum){
            System.out.print(val + " ");
        }


        //Q3 Sort Array of Zeros and Ones

        int[] arr = {0, 0, 1, 0, 0, 1, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] == 0) {
                left++;
            } else {
                Arrays.swap(arr[left], arr[right]);
                right--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }




    }
}
