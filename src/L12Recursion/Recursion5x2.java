package L12Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion5x2 {

    public static int frogEnergy(int idx, ArrayList<Integer> a){

        if(idx == 0) return 0;

        int left = frogEnergy(idx - 1, a) + Math.abs(a.get(idx) - a.get(idx - 1));

        int right = Integer.MAX_VALUE;

        if(idx > 1) right = frogEnergy(idx - 2, a) + Math.abs(a.get(idx) - a.get(idx - 2));

        return Math.min(left, right);

    }

    public static int minBounceEnergy(int n, ArrayList<Integer> height){

        return frogEnergy(n - 1, height);
    }

    static int[] memo2;

    public static int minPossibilityUntilK(int[] h, int n,int k, int i){

        if(i == n) return 0;

        if(memo2[i] != -1) return memo2[i];

        int minCost = Integer.MAX_VALUE;

        for(int j = i + 1; j <= i + k && j <= n; j++){
            int cost = minPossibilityUntilK(h, n, k, j) + Math.abs(h[i] - h[j]);
            minCost = Math.min(minCost, cost);
        }

        memo2[i] = minCost;

        return memo2[i];

    }


    public static int minimalSetOfCoin(int x, int[] coin, int[] memo3){

        if(x < 0) return 0;

        if(memo3[x] != -1) return memo3[x];

        int minCoin = Integer.MAX_VALUE;

        for(int temp : coin){
            int res = minimalSetOfCoin(x - temp, coin, memo3);
            if(res >= 0 && res < minCoin){
                minCoin = res + 1;
            }
        }

        memo3[x] = (minCoin == Integer.MAX_VALUE) ? -1 : minCoin;

        return memo3[x];
        
    }


    public static int stepToConvertIntoZero(int n){

        if(n == 1) return 0;

        int steps = stepToConvertIntoZero(n - 1);

        if(n % 2 == 0)  steps = Math.min(steps, stepToConvertIntoZero(n /2));

        if (n % 3 == 0) steps = Math.min(steps, stepToConvertIntoZero(n /3));

        return steps + 1;

    }



    public static void main(String[] args) {


        //Q6 Find the min possible total cost incurred before the frog reaches Stone N
        int n = 4;
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(20, 30, 40, 20));
        int result = minBounceEnergy(n, height);
        System.out.println(result);


        //Q7 Find the min possible total cost incurred before the frog reaches Stone N
        int[] h2 = {10, 20, 10};
        int N2 = h2.length - 1;
        int K = 4;
        memo2 = new int[N2 + 1];
        Arrays.fill(memo2, -1);
        System.out.println(minPossibilityUntilK(h2, N2, K, 1));


        //Q8 minimal set of coins
        int[] c = {1,5,7};
        int x = 11;
        int[] memo3 = new int[x + 1];
        Arrays.fill(memo3, -1);
        memo3[0] = 0;
        System.out.println(minimalSetOfCoin(x, c, memo3));  


        //Q9 the min no of steps to reduce n to 1
        System.out.println(stepToConvertIntoZero(10));


    }

}
