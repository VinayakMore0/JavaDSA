package L17SearchingAlgorithm;

import java.util.Scanner;

public class VeryEasyTask {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();

        System.out.println(minTime(n, x, y));

    }

    private static int minTime(int n, int x, int y){
        if(n == 1){
            return Math.min(x, y);
        }

        long left = 0;
        long right = (long) Math.max(x, y) * n;
        long ans = 0;

        while(left <= right){

            long mid = (left + right) / 2;

            if(good(n, x, y, mid)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return (int) ans + Math.min(x, y);
    }

    private static boolean good(int n, int x, int y, long mid) {

        return (mid/x) + (mid/y) >= n - 1;
    }

}
