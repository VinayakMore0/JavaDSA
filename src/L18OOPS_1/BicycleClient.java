package L18OOPS_1;

public class BicycleClient {

    public static void main(String[] args) {

        //Create Object
        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();
        sportsBicycle.gear = 20;

        //Create Object
        Bicycle touringBicycle = new Bicycle();

        System.out.println(touringBicycle.gear);
        touringBicycle.braking();

    }

}
