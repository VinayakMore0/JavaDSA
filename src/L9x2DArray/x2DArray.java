package L9x2DArray;

public class x2DArray {

    public static void main(String[] args) {

        int[][] a = new int[3][4];

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println(a.length); //rows
        System.out.println(a[0].length); //cols

        // access
        System.out.println(a[1][2]);

        //set
        a[2][3]  = 100;

        System.out.println(a[2][3]);

        int[][] al = {
                {1,2,7},
                {3,4,8},
                {5,6,9}
        };

        for(int i=0; i< al.length; i++){
            for(int j=0; j< al[0].length; j++){
                System.out.print(al[i][j] + ", ");
            }
            System.out.println();
        }

        for(int[] val : al){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }


        int[][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[5];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }



    }
}
