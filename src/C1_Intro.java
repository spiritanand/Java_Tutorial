public class C1_Intro
{
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
    }
}
