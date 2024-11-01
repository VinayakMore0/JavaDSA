package L3SwitchSt;

public class SwitchStatement {

    public static void main(String[] args) {

        int number = 30;

        String size;

        switch (number){
            case 10:
                size = "small";
                break;
            case 20:
                size = "Medium";
                break;
            case 30:
                size = "Large";
                break;
            case 40:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: "+ size);


    }
}
