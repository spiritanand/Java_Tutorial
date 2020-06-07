import java.lang.Math; // Math Class methods helps to perform the numeric operations like square, square root,

// trigonometric operations and here absolute value of an integer.
public class CodingExercises1 {
    public static void main(String args[]) {
        /*
        This section will contain a few different coding exercise of the course that I am following. Here you
        can test the different methods.
         */
    }
    // This will contain all the methods required for all the coding exercises


//    // 1.Speed Converter
//    public static long toMilesPerHour(double kilometresPerHour){
//        if (kilometresPerHour<0){
//            return -1; // This indicates invalid value.
//        }else {
//            double milesPerHour = kilometresPerHour/1.609 ;
//            return Math.round(milesPerHour);
//        }
//    }
//
//    public static void printConversion(double kilometresPerHour){
//        if (kilometresPerHour<0){
//            System.out.println("Invalid Value");
//        }else{
//            long milesPerHour = toMilesPerHour(kilometresPerHour);
//            System.out.println(kilometresPerHour+" km/h = "+milesPerHour+" mi/h");
//        }
//    }


    // 2.MegaBytes Converter


//    // 3.Barking Dog
//    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//        if (barking) {
//            if ((hourOfDay < 0) || (hourOfDay > 23)) {
//                return false;
//            } else if ((hourOfDay < 8) || (hourOfDay > 22)) {
//                return true;
//            }
//        }
//        return false;
//    }


//    // 4.Leap Year Calculator
//    public static boolean isLeapYear(int year){
//        if ((year<1) || (year>9999)){
//            return false;
//        }else {
//            if (year%4==0){
//                if (year%100==0){
//                    if (year%400==0){
//                        return true;
//                    }
//                }else {
//                    return true;
//                }
//            }else{
//                return false;
//            }
//        }
//        return false;
//    }


//    // 5. Decimal Comparator
//    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
//        int x1 = (int)(x*1000);
//        int y1 = (int)(y*1000);
//        if (x1==y1){
//            return true;
//        }
//        return false;
//    }


    // 6.Equal Sum Checker


    // 7.Has Teen Value


    // 8. Area Calculator


//    // 9. Minutes to Years and Days Calculator
//    public static void printYearsAndDays(long minutes){
//        if (minutes<0){
//            System.out.println("Invalid Value");
//        }else{
//            long minutesDays = ((minutes/60)/24);
//            long years = minutesDays/365L;
//            long days = minutesDays%365L;
//            System.out.println(minutes+" min = "+years+" y and "+days+" d");
//        }
//
//    }


    // 10.Equality Printer


//    // 11. Playing Cat
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if (summer) {
//            if ((25 <= temperature) && (temperature <= 45)) {
//                return true;
//            }
//        } else {
//            if ((25 <= temperature) && (temperature <= 35)) {
//                return true;
//            }
//        }
//        return false;
//    }

    // 12.Number in Word


//    // 13.Number of Days In Month
//    public static int getDaysInMonth(int month, int year){
//        if ((month<0)||(month>12)||(year<1)||(year>9999)){
//            return -1;
//        }
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                return 31;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                return 30;
//            case 2:
//                if (isLeapYear(year)){
//                    return 29;
//                }else{
//                    return 28;
//                }
//        }
//        return -1;
//    }


    // 14. Sum Odd


    // 15. GCD - Greatest Common Divisor
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int b1 = a % b;
            return GCD(b, b1);
        }
    }

//    // 16. All Factors
//    // This will print out all the factors of a given number, though not in the right and sorted order. The
//    // sorting bit I leave it on you guys.
//    public static void fac(int number) {
//        int n = (int) Math.sqrt(number);
//        for (int i = 1; i <= n; i++) {
//            if (number % i == 0) {
//                System.out.println(i);
//                int i1 = number / i;
//                System.out.println(i1);
//            }
//        }
//    }
}
