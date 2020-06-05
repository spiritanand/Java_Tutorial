public class C4_IfThen {
    public static void main(String args[]) {

        /*
        In this section we will be covering the if-then statement. It is the most basic level of control flow
        statements. It tells the program to execute a certain code if the condition specified is true and
        perform certain statements (code) if the code is false. This is conditional logic.
        If-then statement only executes the next statement if used without any code block. Hence, it is
        recommended to always use a code block.
         */

        boolean isBeast = false;
        // The '==' checks whether the RHS and LHS are literally the same and returns a boolean.
        // It is different from the '=' symbol which is used for value assignment of a variable.
        if (isBeast == false)
            System.out.println("I am not scared of Beasts.");
        System.out.println("I am though.");// We do not see any use of the code block.
        if (isBeast == true)
            System.out.println("I am not scared of Beasts.");
        System.out.println("I am though \uD83D\uDE09.");// Until we see this statement printed even though
        // the whole if
        // block should not run as the condition provided is false.

        // So we use a code block to execute the whole thing within a single block.

        if (isBeast == true) {
            System.out.println("I am not scared of Beasts.");
            System.out.println("This would not be printed now as the condition is not true, my secret is safe.");
        }
    }
}
