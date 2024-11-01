package L11MemoryManagement;

public class StackMemory {
    public static void main(String[] args) {


        System.out.println("Hello there!");
//        greeting();
//        askQuery();

        int defaultVal = 2;
        defaultVal = multiplyTwo(defaultVal);
        defaultVal = multiplyFour(defaultVal);

        System.out.println(defaultVal);

    }

    public static int multiplyFour(int val){
        val *= 4;
        return val;
    }


    public static int multiplyTwo(int val) {
        val *= 2;
        return val;
    }

    public static void greeting(){
        System.out.println("Hope! You're doing well");
    }

    public static void askQuery(){
        System.out.println("How may I help you today? ");
    }

}
