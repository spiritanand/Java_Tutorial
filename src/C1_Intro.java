public class C1_Intro {
    /* public is an access modifier. An access modifier allows us to define the scope
     * public gives us full access. */

    /* Method is a collection of statements that performs an operation. Here we will be using a special
    method called main. Java looks for this main method always when running a program. It is the entry point of the
    code. We can also create our own methods.
     */
    public static void main(String args[]) {
        // void is used to show that the method will not be returning anything.
        System.out.println("Hello Java. This is our Universe!");
        // The stuff in " " is known as literal string
        // This is a comment.
        /*
        Comments are very useful in various things like adding documentation which is a healthy practice to
        follow or for testing(will be covered in a future section) and any code in a comment till the end of
        the line is ignored by the computer.
        To add a comment we can use two backslashes '/'+'/'. Any code after these two back slashes will be
        ignored till the end of the line. Another way to make multi line comments is '/'+'*'  ""CODE""  '*'+'/'.
         */

        /* {
        This is known as a code block.
        Multiple
        lines
        of
        code
        can be written in it and will be considered as a part of a code block.
        } */
        // The importance of code block will be FELT in future sections as we proceed.

        // A statement in Java is the entire line,not necessarily a single line of code. A semi-colon (;) is
        // mostly needed to complete a Java statement with a few exceptions which we will see.

        /*
        Keywords are special reserved words in Java that have predefined meaning in the language; because of
        this,programmers cannot use keywords as names for variables, methods, classes, or as any other identifier.
        Due to their special function they are highlighted in most modern IDE's.

        I have attached the list of all the 51 Java keywords.
        Source - Wikipedia
         */

        // For Example :-

        // int int = 10; // This is an invalid statement
        // Error Message - Error:(45, 9) java: not a statement

        // However,

        int int2 = 12;
        System.out.println("This is a perfectly valid statement. The output of int2 is :- " + int2);

        // It is a good practice to separate out the operator and the operands and the variable with whitespaces.
        // TBH it would not affect Java much but it would certainly increase the readability of your code.

        // Another good practice is to indent your code to make it more readable. Making your code more
        // readable increases your productivity as it makes it easier for you and your teammates to detect and
        // fix bugs. Many modern IDE like intellijJ automatically indent your code.
    }
}