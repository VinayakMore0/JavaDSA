package L5ProblemSolving;

import L1HelloWorld.HelloWorld;

public class TypeCasting {

    public static void main(String[] args) {


        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        //implicit

        sh = by;
        in = sh;
        lo = in;
        lo = sh;
        lo = by;

        by = 100;
//        for(byte b=0; b<=128; b++){
//            System.out.println("Hello");
//        }


        float f = 5.6f;
        double d = 6.7;

        d = f;


        //explicit

        in = (int) f;
        byte b = (byte)130;

        System.out.println(b); //Output: -126

        char ch = 'a';

        in = ch;

        System.out.println(in);
        System.out.println(ch);
        System.out.println((int)ch);

        ch= 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char)(ch + 1);
        System.out.println(ch);

        ch = 'a' + 1;
        ch = (char)('a'+ch);     System.out.println(ch);


        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2+ ' '+ 5);
        System.out.println(2+ " "+ 5);
        System.out.println("Hello"+'\t'+"World");
        System.out.println("Hello"+"\t"+"World");
        System.out.println(2+ '\t'+ 3);



    }
}
