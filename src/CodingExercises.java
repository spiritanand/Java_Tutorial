public class CodingExercises {
    public static void main(String args[]){
        /*
        This section will contain the different the coding exercise of the course that I am following. Here we
        will test our different methods.
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

    // 4.Leap Year Calculator
    public static boolean isLeapYear(int year){
        if ((year<1) || (year>9999)){
            return false;
        }else {
            if (year%4==0){
                if (year%100==0){
                    if (year%400==0){
                        return true;
                    }
                }else {
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}
