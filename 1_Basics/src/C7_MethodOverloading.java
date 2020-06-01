public class C7_MethodOverloading {
    public static void main(String args[]) {
        /*
        Java can distinguish the methods with different method signatures. i.e. the methods can have same name
        but with different parameters list (i.e. number of the parameters, order of the parameters, and data
        types of the parameters). This is very commonly used all around in Java programming.

        Q> Why do we need overloading ?
        Answer --> If we need to do same kind of the operation with different ways i.e. for different inputs.
         In the example described below, we are doing length conversion for different inputs (though this
         example is not that realistic.)
         It is hard to find many different meaningful names for single action.

        Q> Different ways of method overloading ?
        Answer --> Method overloading can be done by changing:
        1.The number of parameters in two methods.
        2.The data types of the parameters of methods.
        3.The Order of the parameters of methods.

        Here we are creating to methods of the same name, but of different method signatures our program is
        a converter of length.
        In the first method we have two parameters of the double data type and in the second method we have a
        single parameter of double data type.


        NOTE :- Method overloading cannot be done by changing the return type. The method signature needs to be
         changed for this to work.
         */
        calcFeetAndInchesToCm(100);
    }

    public static double calcFeetAndInchesToCm(double feet, double inches) {
        if ((feet >= 0) && ((inches >= 0) && (inches <= 12))) {
            double cm = 12 * (2.54) * feet;
            cm += 2.54 * inches;
            System.out.println("The converted length is " + cm + " cm");
            return (cm);
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCm(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double rem_inches = (int) inches % 12;
            System.out.println(inches + " Inches is equal to " + feet + " feet and " + rem_inches + " inches");
            return calcFeetAndInchesToCm(feet, rem_inches);

        } else {
            System.out.println("Invalid Input!");
            return -1;
        }
        /*
        The advantage of method overloading is that we just need to remember the single method name to do
        slightly different stuff based on the type and number of parameter passed.
        Say when you want to sum 3, 5 and 7 numbers. Then for them you could just use the same method name as
        sum and then pass on different parameters to it. This bring about consistency.

        Another great example in java is the println method which is actually 10 different methods with the name
        and depends on the type(s) of parameter we use.
         */
    }
}
