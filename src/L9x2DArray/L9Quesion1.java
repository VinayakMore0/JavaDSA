package L9x2DArray;

public class L9Quesion1 {

    public static void main(String[] args) {

        //Q1 print in wave format

        int[][] a = {
                {1,2,7,10},
                {3,4,8,11},
                {5,6,9,12}
        };

        waveDisplay(a);


        //Q2 Transpose Matrix

        int[][] matrix = {
                {2,4,-1},
                {-10,5,11},
                {18,-7,6}
        };

        transpose(matrix);

        //Q3 Matrix Multiplication

        int[][] one = {
                {1,2,3},
                {4,5,6},
        };

        int[][] two = {
                {1,2},
                {3,4},
                {5,6},
        };

        multiplication(one, two);


    }

    public static void multiplication(int[][] one, int[][] two){

        int[][] ans = new int[one.length][two[0].length];

        for(int i=0; i< ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                int sum = 0;
                for(int k=0; k<one[0].length; k++){
                    int temp = one[i][k] * two[k][j];
                    sum += temp;
                }
                ans[i][j] = sum;
            }
        }

        for(int[] val : ans){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }


    public static void transpose(int[][] arr){

        System.out.println();

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] ans = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                ans[j][i] = arr[i][j];
            }
        }

        for(int[] val : ans){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }

    public static void waveDisplay(int[][] arr){

        for(int c=0;c<arr[0].length; c++){
            if(c%2 == 0){
                for(int r=0; r< arr.length; r++){
                    System.out.print(arr[r][c] + " ");
                }
            }else{
                for(int r= arr.length-1; r>=0; r--){
                    System.out.print(arr[r][c] + " ");
                }
            }
        }


    }



}
