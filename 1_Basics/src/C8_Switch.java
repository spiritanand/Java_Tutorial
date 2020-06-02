public class C8_Switch {
    public static void main(String args[]) {
        /*
        In the previous sections we have seen the if-then-else statements. Such statements are known as control
         flow statements for self-explanatory reasons. In this section and the next few sections we will see a
         few more such control flow statements.
         Here we are having a look at the switch statements.
         */

        // Let us have a look of what are we trying to simplify using a switch.
        int ifVal = 2;
        if (ifVal == 1) {
            System.out.println("1");
        } else if (ifVal == 2) {
            System.out.println("2");
        } else {
            System.out.println("Neither");
        }
        // In this case we want a certain bock of code to be executed when a specific condition is fulfilled.
        // Here we are switching from values of 1 to 2 (and it could be extended to greater numbers). But this
        // could become cumbersome and confusing when we are using it for say 10 or much more cases. So here is
        // where the switch statement comes in.

        int swVal = 3;

        switch (swVal) {
            case 1:
                System.out.println("1");
                break;// Break Statement is a "loop control statement" which is used to "terminate" the loop.
            // If the break is not used we will get unexpected results (check it out yourself ;-) ).
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("If all the other cases are not executed then we will execute this block of " +
                        "code");
        }
        // This makes the life of a programmer easy (Give us a BREAK (☞ﾟヮﾟ)☞ !!). Hence, using a switch gives us
        // the power of "multiple executable paths" in the easiest way possible. A switch works with the byte,
        // short, char, string and int primitive data types. So we might as well have used 'A' or 'B' or 'C' in
        // place of the integers.
        // But one of the advantages of the if-then-else statement is that we can check multiple conditions at
        // a time or even different conditions apart from the value of the variable. So the if-else provides us
        // with more flexibility.
        // A switch statement is used when we are only checking the value of a single variable.
    }
}