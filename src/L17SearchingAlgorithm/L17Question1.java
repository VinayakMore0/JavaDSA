package L17SearchingAlgorithm;

public class L17Question1 {

    public static int findPeakElement(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = (l + r) / 2;

            if(nums[mid] > nums[mid + 1]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public static boolean squareOrNot(int[] arr, int x){
        int l = 0;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(mid * mid == x){
                return true;
            }else if(mid * mid < x){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }


    public static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target) return mid;

            if(nums[mid] >= nums[lo]){
                if(target >= nums[lo] && target < nums[mid]){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[hi]){
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }


    public static int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int lo = 0, hi = n - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[lo] < nums[hi]) return nums[lo];

            if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if(mid + 1 < n && nums[mid + 1] < nums[mid]){
                return nums[mid + 1];
            }
            
            if(nums[lo] < nums[mid]){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        //Q1 Find Peak Element
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));


        //Q2 Given value of x, tell if x is a square of an integer or not,
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(squareOrNot(arr, 16));


        //Q3 Search in Rotated Sorted Array
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums2, 0));


        //Q4 Find Minimum in Rotated Sorted Array
        int[] nums3 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums3));


    }

}
