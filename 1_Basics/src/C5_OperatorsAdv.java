public class C5_OperatorsAdv {
    public static void main(String args[]) {
        // In this section we will be covering some more useful operators.

        // Let us look at some basic mathematical operators.

        // Initializing value to 30

        int myVal = 30;
        if (myVal == 30) // This '==' operator checks if the LHS and the RHS have the same value and returns a
            // Boolean valued true if they are equal, else it returns false.
            System.out.println("myVal is equal to 30");

        if (myVal != 30) // This '!=' operator checks if the LHS and the RHS do not have the same value and
            // returns a Boolean valued true if they are not equal, else it returns false.
            System.out.println("This statement won't get printed as the value is equal to 30");
        // The not '!' operator is also known as the logical compliment operator. For use with booleans it
        // tests for the alternate value.

        if (myVal > 30) // This '>' operator checks if the LHS is greater than the RHS have and returns a Boolean
            // valued true if it is greater, else it returns false.
            System.out.println("myVal is not greater than 30");

        if (myVal < 40) // This '<' operator checks if the LHS is less than the RHS have and returns a Boolean
            // valued true if it is less, else it returns false.
            System.out.println("myVal is less than 40");

        // We can add an equal to '=' symbol in front of the '>' or the '<' symbol to include the boundary
        // conditions. For example:-

        if (myVal >= 30) // This '>' operator checks if the LHS is greater than or equal to the RHS returns a
            // Boolean valued true if it is , else it returns false.
            System.out.println("myVal is greater or equal to than 30");

        // Initializing some values.
        int myVal2 = 9;int myVal3 = 12;

        // Now lets take a look at the and '&&' operator.

        if ((myVal > myVal2) && (myVal > myVal3)) // Here we are using the and '&&' operator. Here both the
            // conditions need to be true for the true code block to be executed. If any one of the conditions
            // is false then this block would not be executed.
            System.out.println("myVal is greater than myVal2 and myVal3.");

        // Now lets take a look at the or '||' operator
        if ((myVal > myVal2) || (myVal < myVal3)) // Here we are using the or '||' operator. Here either one of
            // the conditions need to be true for the true code block to be executed. Iff both of the conditions
            // are false only then this block would not be executed.
            System.out.println("myVal is greater than myVal2, but myVal is not myVal3.");// Yet this will be
            // printed as one of the conditions is true.

        // Now lets take a look at the ternary operator. Here ternary operator refers to the fact that we are
        // dealing with three operands.
        // The first operand is the condition we are testing. It should return a value as true or false.
        // The second operand is the condition we are going to assign the variable to this second operand.
        // If the first operand returns false then the third operand is assigned to the variable.
        // For example :-

        boolean myTer = (myVal == 30)? true : false;
        // Here myTer will be assigned the second operand that is true as the first operand returns true.
        System.out.println("myTer has been assigned the value :- "+myTer);

        int val = (myVal != 30)? 1 : 0;
        // Here val will be assigned the third operand (0) as the first operand returns false.
        System.out.println("val has been assigned the value :- "+val);

        // The ternary operator is a shortcut to the if-then-else (will be covered in a future section).

        // Take a look at the Java Operator Precedence Table that I have added in the repo. A higher precedence
        // means it will be executed before.

    }
}
