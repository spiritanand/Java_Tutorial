public class TimeConChallenge {
    public static void main(String args[]) {
        System.out.println(getDurationString(182256));
        System.out.println(getDurationString(122, 156));
    }
    /*
    Here you will notice that we were returning (now commented) the String "Invalid Value!" multiple times
    (2 times). To make this easier and so that we do not have to repeat the same String over and over again we
    can use the constants. This also makes it easier to debug and change the message in a single place. Now as
    their name suggests constants have constant value and they do not change their values.
    Let us take a look at an example: -
     */

    public static final String INVALID_MESSAGE = "Invalid Value! Try again."; // static as it is being used in
    // a static method.
    // Here the keyword final indicates that this is a constant. It is good practice to name constants in all
    // capital letters as it explicitly states that it is a constant.

    public static String getDurationString(int min, int sec) {
        if ((min < 0) || (sec > 59) || (sec < 0)) {
            // return "Invalid Value!";
            return INVALID_MESSAGE;
        }
        int hours = min / 60;
        min = min % 60;
        return (hours + "h" + min + "m" + sec + "s");
    }

    public static String getDurationString(int sec) {
        if (sec < 0) {
            // return "Invalid Value!";
            return INVALID_MESSAGE;
        }
        int min = sec / 60;
        sec = sec % 60;
        return (getDurationString(min, sec));
    }
}
