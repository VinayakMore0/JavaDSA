package L9x2DArray;

import java.util.ArrayList;
import java.util.List;

public class L9Quesion2 {

    public static void main(String[] args) {


        //Q1 Set Matrix Zeroes
        int[][] m1 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        for(int[] val: m1){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        setZeroes(m1);
        for(int[] val: m1){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }


        //Q2 Rotate image
        int[][] m2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] val: m2){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        rotate(m2);
        for(int[] val: m2){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        //Q3 Spiral matrix
        int[][] m3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] val: m3){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        spiralOrder(m3);

    }


    public static void spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0;
        int ec = n-1;
        int er = m-1;
        int sc = 0;
        List<Integer> res = new ArrayList<>();
        int count = m*n;
        while(count > 0){
            //sr
            for(int i = sc; i <= ec; i++){
                res.add(matrix[sr][i]);
                count--;
            }
            sr++;
            if(count == 0) break;

            //ec
            for(int i = sr; i <= er; i++){
                res.add(matrix[i][ec]);
                count--;
            }
            ec--;
            if(count == 0) break;

            //er
            for(int i = ec; i >= sc; i--){
                res.add(matrix[er][i]);
                count--;
            }
            er--;
            if(count == 0) break;

            //sc
            for(int i = er; i >= sr; i--){
                res.add(matrix[i][sc]);
                count--;
            }
            sc++;
            if(count == 0) break;
        }
        System.out.println(res);
    }


    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for(int col = 0; col < n; col++){
            int i = 0;
            int j = n-1;
            while(i <= j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    public static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false;
        boolean isCol = false;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0) isRow = true;
                    if(j == 0) isCol = true;
                }
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(isRow){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(isCol){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }


}
