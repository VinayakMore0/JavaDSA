package L12Recursion;

public class Recursion3 {


    public static void squareStars(int row, int col, int n){
        if(row > n) return;
        if(col > n){
            System.out.println();
            squareStars(row + 1, 1, n);
            return;
        }
        System.out.print('*');

        squareStars(row, col+1, n);
    }


    public static void rightAngleTriangle(int row, int col, int n){
        if(row > n) return;
        if(col > row){
            System.out.println();
            rightAngleTriangle(row+1, 1, n);
            return;
        }
        System.out.print('*');

        rightAngleTriangle(row, col+1, n);
    }


    public static void topRightAngleTriangle(int row, int col, int n){
        if(row > n) return;
        if(col > (n - row + 1)){
            System.out.println();
            topRightAngleTriangle(row + 1, 1, n);
            return;
        }
        System.out.print('*');

        topRightAngleTriangle(row, col+1, n);
    }


    public static void removeX(String str, int idx, String output){

        if(idx >= str.length()) {
            System.out.println(output);
            return;
        }

        if(str.charAt(idx) != 'x'){
            removeX(str, idx+1, output + str.charAt(idx));
        } else {
            removeX(str, idx+1, output);
        }

    }

    public static void possibleSubSequences(String str, int idx, String output){

        if(idx >= str.length()){
            System.out.println('[' + output + ']');
            return;
        }

        possibleSubSequences(str, idx+1, output + str.charAt(idx));

        possibleSubSequences(str, idx+1, output);

    }




    public static void main(String[] args) {

        //Q1 Print n * n square stars
        squareStars(1, 1, 5);

        //Q2 Right angle triangle
        rightAngleTriangle(1, 1, 5);

        //Q3 Top Right Angle Triangle
        topRightAngleTriangle(1, 1, 5);

        //Q4 Return String without x
        String str = new String("andxanvxkdxaxsxnd");
        removeX(str, 0, "");

        //Q5 Return all possible subsequences of string
        String s = "abcd";
        possibleSubSequences(s, 0, "");



    }

}
