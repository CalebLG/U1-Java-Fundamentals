public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {

        int totalSeconds = 4259;

        int numHours = totalSeconds/3600;
        totalSeconds = totalSeconds % 3600;

        int numMinutes = totalSeconds/60;
        totalSeconds = totalSeconds % 60;

        int numSeconds = totalSeconds/1;
        totalSeconds = totalSeconds % 1;

        System.out.println("Total hours and minutes broken down from " + 4200 + " seconds");
        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " + numMinutes);
        System.out.println("Seconds: " + numSeconds);


    }
}
