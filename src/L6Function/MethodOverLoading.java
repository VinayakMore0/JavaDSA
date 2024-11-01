package L6Function;

public class MethodOverLoading {

    public static String formatNumber(int value){
        return String.format("%d", value);
    }

    public static String formatNumber(double value){
        return String.format("%.3f", value);
    }

    public static String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }


    public static void main(String[] args) {

        System.out.println(formatNumber(500));
        System.out.println(formatNumber(89.934));
        System.out.println(formatNumber("550"));

    }
}
