import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(armstrongNumber(n));


    }

    public static String armstrongNumber(int n) {
        // code here

        int fn = n;
        int count = 0;

        while(fn>=0){
            fn = fn/10;
            count++;
        }

        fn = n;
        int sum = 0;

        while(fn>=0){
            int rem = fn/10;
            sum += Math.pow(rem, count);
            fn = fn/10;
        }

        if(sum == n){
            return "true";
        }else{
            return "false";
        }




    }



}