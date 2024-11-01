package L4Loops;
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

     int n1 = 10;
     int i1 = 1;

     while(i1 <= n1){
         System.out.println(i1);
         i1++;
     }

     Scanner scn = new Scanner(System.in);

//     // Reverse number
//
//     int n = scn.nextInt();
//     int ans = 0;
//
//     while(n>0){
//         int rem = n%10;
//         n /= 10;
//         ans = ans *10 + rem;
//     }
//        System.out.println(ans);
//

     // do while loop

        int m = 10;
        do{
            System.out.println("Hello");
            m++;
        }while(m<=9);

    }
}
