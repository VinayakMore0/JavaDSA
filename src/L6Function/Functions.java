package L6Function;

public class Functions {

    public static void main(String[] args) {

        sayHello();

        addNumbers(23,34);


        int res = addNumbers(34,56);
        System.out.println(res);


        int res2 = addNumbers();
        System.out.println(res2);


        for(int i=1; i<=5; i++){
            int result = getSquare(i);
            System.out.println(i+"^2= "+ result);
        }


        System.out.println("------------CASE1-----------");
        int one = 10;
        int two = 20;

        int sum = scopes(one, two);
        System.out.println(sum);


        System.out.println("------------CASE2------------");
        System.out.println(one+ ", " + two);
        swap(one, two);
        System.out.println(one+ ", " + two);


    }

    public static int scopes(int one, int another){
        int sum = one + another;
        return sum;
    }

    public static void swap(int one, int two){
        System.out.println(one+ ", " + two);
        int temp = one;
        one = two;
        two = temp;
        System.out.println(one+ ", " + two);

        
    }


    public static int getSquare(int x){
        return x*x;
    }

    public static void sayHello(){
        System.out.println("Hello");

    }

    public static int addNumbers(int val1, int val2){

        int sum = val1 + val2;
//        System.out.println(sum);
        return sum;
    }

    public static int addNumbers(){
        int a = 5;
        int b = 10;

        int sum = a+b;
        return sum;
    }


}
