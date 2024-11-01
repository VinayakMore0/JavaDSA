package L18OOPS_1;

public class Main {

    private String name;

    Main(){
        System.out.println("Constructor called");
        name = "Vinayak More";
    }

    Main(String lang){
        name = lang;
        System.out.println(name + " is a programming language");
    }


    public static void main(String[] args){
        Main obj = new Main();
        System.out.println("The name is " + obj.name);

        Main obj1 = new Main("C++");

    }


}
