package L2ExperationBlocks;

public class ifElse {

    public static void main(String[] args) {


        boolean primeSubscription = true;

        if(primeSubscription == true){
            System.out.println("Welcome to prime subscription ");
        }else{
            System.out.println("Please become a member of prime subscription");
        }

        int num = -10;

        if(num < 0){
            System.out.println("It is a negative number");
        }

        int subscription = 1;

        if (subscription == 0){
            System.out.println("Get a subscription");
        }else if(subscription == 1){
            System.out.println("You have a super subscription");
        }else if(subscription ==2){
            System.out.println("Welcome to premium subscription");
        }else {
            System.out.println("Invalid Input");
        }


        boolean primeSubs = true;
        boolean acorn = false;
        boolean amc = false;

        if(primeSubs){
             if (acorn || amc){
                 System.out.println("Yes, you can watch it");
             }else {
                 System.out.println("You need acorn or amc subs to watch");
             }
        }else {
            System.out.println("Need prime subs ");
        }

    }
}
