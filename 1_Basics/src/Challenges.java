public class Challenges {
    public static void main(String[] args) {
        /*
        This will contain challenges from various modules. Treat these challenges as exercises to build upon
        your knowledge from the class.
         */
//
//        // Primitive Types Challenge
//        byte varByte = 127;
//        short varShort = 19221;
//        int varInt = 509519;
//        long varLong = 50000L + 10L * (varByte + varInt + varShort);
//        System.out.println(varLong);
//
//        // Convert given number of pounds to kilograms.
//        double pounds = 1769.142d;
//        double con_kg = pounds * 0.45359237d;
//        System.out.println("The converted weight in kg is :- " + con_kg);

        // ** -- Operator Challenge -- **

        // Start

        double var1 = 20d, var2 = 80d;
        double addVar = (var1 + var2) * 100d;
        double rem = addVar % 40;
        boolean bol = (rem == 0) ? true : false;
        System.out.println(bol);
        if (!bol) {
            System.out.println("Got some remainder");
        }
        //End

    }
}
