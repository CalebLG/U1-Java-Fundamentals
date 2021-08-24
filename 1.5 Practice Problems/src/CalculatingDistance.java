public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.
    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {

        double hours = 0.75;
        double mph = 55;

        double distance = hours * mph;

        System.out.println("The total distance traveled is " + distance);

    }
}
